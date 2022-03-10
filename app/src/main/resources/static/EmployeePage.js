// JavaScript source code



let formlogin = document.getElementById('loginForm');

console.log(formlogin);

formlogin.addEventListener('submit', Sumitform);

let v = 5678;

console.log(v);


/*
let data = {
    username: document.getElementById('username'),
    password: document.getElementById('password')


}*/
function Sumitform(event) {

    event.preventdefault();
    const formdata = new FormData(this);
    let urlLoign = 'http://localhost:8080/login';
    fetch(urlLoign, {
        method: 'post',
        body: formdata
    })
        .then(function (response) {
            console.log('login succfuly', formdata);

            return response.text()

        }).then(function (text) { console.log(text) })



       


}