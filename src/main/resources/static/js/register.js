// Call the dataTables jQuery plugin
$(document).ready(function() {
// on ready
});

async function registerUser() {
    let data = {};
    data.username = document.getElementById('username').value;
    data.lastname = document.getElementById('lastname').value;
    data.email = document.getElementById('email').value;
    data.password = document.getElementById('password').value;

    let repeatPassword = document.getElementById('repeatPassword').value;

    if (repeatPassword != data.password) {
        alert('Repeat password is incorrect');
        return;
    }

    const request = await fetch('api/register-users', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
        });
    const users = await request.json();
}