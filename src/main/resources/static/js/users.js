// Call the dataTables jQuery plugin
$(document).ready(function() {
  loadUsers();
  $('#users').DataTable();
});

async function loadUsers() {
    const request = await fetch('api/users', {
            method: 'GET',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        });
        const users = await request.json();
        let usersList = '';
        for (let user of users) {
            let deleteButton = '<a href="#" onclick = "deleteUser('+ user.id +')"class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';
            let userRaw = '<tr><td>'+user.username
                        +'</td><td>'+user.lastname
                        +'</td><td>'+user.email
                        +'</td><td>'+user.phone
                        +'</td><td>'+deleteButton+'</td></tr>';
            usersList += userRaw;
        }
        console.log(users);
        document.querySelector('#users tbody').outerHTML = usersList;
}

async function deleteUser(id){

    if(!confirm('¿Are you sure you want to delete?')){
        return;
    }

    const request = await fetch('api/delete-user/' + id, {
        method: 'DELETE',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });

    location.reload();
}