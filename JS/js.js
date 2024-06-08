/* Simple Output
window.alert("You're Logged In!");
console.log("Hello World!");
#####################################################################################################*/
//This is a comment.
/* This is
a multiline
comment
#####################################################################################################*/
/* Variables
let fname = "Ahmed";
let lname = " Hassan";
let tname = fname + lname ;
let age = 19;
let student = true;
#####################################################################################################*/
/* Using Variables in JS
console.log(tname);
console.log("I'm",tname,".");
console.log("I'm",age,"Years Old.");
console.log("Student:",student);
#####################################################################################################*/
/* Using Variables in HTML
document.getElementById("h1").innerHTML = "Welcome " + fname + "!";
document.getElementById("p1").innerHTML = "Name: " + tname;
document.getElementById("p2").innerHTML = "Age: " + age;
document.getElementById("p3").innerHTML = "Student: " + student;
#####################################################################################################*/
/* Arithmetic Operators
 (+ - * / ** %)
Increament/Decreament operators by 1 : ++ or --
shortcuts by x : +=x or -=x or etc...
#####################################################################################################*/
/* Getting Input Using Window Prompt
let username = window.prompt("Enter your username:");
console.log("Hello",username,"!");
#####################################################################################################*/
/* Getting Input Using HTML Textbox
let username;
document.getElementById("button").onclick = function(){
    username = document.getElementById("username").value;
    document.getElementById("welcome").innerHTML = "Welcome " + username + "!";
}
#####################################################################################################*/
/* Type conversion
let x , y , z ;
x = Number(1);
y = String(1);
z = Boolean(1);
console.log(x+1 , typeof(x));
console.log(y+1 , typeof(y));
console.log(z , typeof(z));
#####################################################################################################*/
/* Constants
const PI = 3.14;
let radius = window.prompt("Enter the radius:");
radius = Number(radius);
let circumference = 2*PI*radius;
console.log("Circumference = ",circumference);
#####################################################################################################*/
/* MATH
let x = 85.45;
let y = 10;
let z = 100;
console.log(Math.round(x));
console.log(Math.floor(x));
console.log(Math.ceil(x));
console.log(Math.pow(x,2));
console.log(Math.sqrt(x));
console.log(Math.abs(x));
console.log(Math.max(x,y,z));
console.log(Math.min(x,y,z));
console.log(Math.PI);
let r = Math.ceil(Math.random()*6);
console.log(r);
#####################################################################################################*/
/* Hypoteneous Calculator
let a,b,c;
document.getElementById("submit").onclick = function(){
a = Number(document.getElementById("atextbox").value);
b = Number(document.getElementById("btextbox").value);
c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
document.getElementById("clabel").innerHTML = "Hypotenous = " + c ;
}
#####################################################################################################*/
/* Seb7a
let c=0;
document.getElementById("decbtn").onclick=function(){
    c-=1;
    document.getElementById("count").innerHTML = c;   
}
document.getElementById("resbtn").onclick=function(){
    c=0;
    document.getElementById("count").innerHTML = c;   
   }
document.getElementById("incbtn").onclick=function(){
    c+=1;
    document.getElementById("count").innerHTML = c;   
   }
#####################################################################################################*/
/*Strings
let myname = "Ahmed Hassan";
let birthday = "10-10-2004";
let fname = myname.slice(0,5);
let lname = myname.slice(6);
console.log(fname);
console.log(lname);
fname = myname.slice(0,myname.indexOf(" "));
lname = myname.slice(myname.indexOf(" ")+1);
console.log(fname);
console.log(lname);
console.log(myname.length);
console.log(myname.charAt(0));
console.log(myname.indexOf('H'));
console.log(myname.lastIndexOf('a'));
console.log(myname.toUpperCase());
console.log(myname.toLowerCase());
myname = "     Ahmed Hassan     ";
console.log(myname.trim());
birthday = birthday.replaceAll('-','/');
console.log(birthday);
#####################################################################################################*/
/* Method chaining is calling one function after another in the same line of code separating them with a '.' .
#####################################################################################################*/
/* IF Statements
let age = 19;
if(age>=100){
    console.log("You're supposed to be dead!");
}
else if(age<0){
    console.log("You haven't been born yet!");
}
else if(age<18){
    console.log("You are a child!");
}
else{console.log("You are an adult. You can access the website!");}
#####################################################################################################*/
/* Checked Property
document.getElementById("submit").onclick=function(){
const check = document.getElementById("check")
const visa = document.getElementById("visa")
const master = document.getElementById("master")
const paypal = document.getElementById("paypal")
if(check.checked){document.getElementById("subs").innerHTML = "You're Subscribed!"}
else{document.getElementById("subs").innerHTML = "You're not Subscribed!"}
if(visa.checked){document.getElementById("card").innerHTML = "You're paying with Visa."}
else if(master.checked){document.getElementById("card").innerHTML = "You're paying with Mastercard."}
else if(paypal.checked){document.getElementById("card").innerHTML = "You're paying with Paypal."}
else{document.getElementById("card").innerHTML = "You must select a payment method!"}
}
#####################################################################################################*/
/* Switch
let grade = window.prompt("Enter Your Grade:");
switch(grade){
    case 'A': console.log("EXCELLENT!");break;
    case 'B': console.log("VERY GOOD!");break;
    case 'C': console.log("GOOD!");break;
    case 'D': console.log("BARELY PASSED!");break;
    case 'F': console.log("FAILED!");break;
    default: console.log(grade,"isn't a grade letter!");
}
#####################################################################################################*/
/* While Loop
let username = "";
while(username == "" || username == null){
    username=window.prompt("Enter Your Username:");
}
console.log("Welcome",username,"!");
#####################################################################################################*/
/* Do While Loop
let username;
do{
    username=window.prompt("Enter Your Username:");
}while(username == "" || username == null)
console.log("Welcome",username,"!");
#####################################################################################################*/
/* for Loop
for(let i=1 ; i<=10 ; i++){
    console.log(i); // break; continue;
}
#####################################################################################################*/
/* Nested Loop
let s,r; 
document.getElementById("submit").onclick = function(){ 
    document.getElementById("fig").innerHTML = '';
    s = document.getElementById("symbol").value; 
    r = Number(document.getElementById("rows").value); 
    for(let i=1 ; i<=r ; i++){
        for(let j=1 ; j<=i ; j++){
            document.getElementById("fig").innerHTML += s;
        }
        document.getElementById("fig").innerHTML += "<br>";
    }
}
#####################################################################################################*/
/* Functions
function rec(l,w){
    let a=l*w;
    return a;
}
let length = window.prompt("Enter Length");
let width = window.prompt("Enter Width");
console.log("Area = " + rec(length,width) + " cm^2");
#####################################################################################################*/
/* Trenary Operator
let condition = true;
condition?console.log("YES!"):console.log("NO!")
#####################################################################################################*/
/* Var
for(var i=1 ; i<=3 ; i++){
    console.log(i);
}
console.log(i);
//("let" makes variable limited to the function(){} , while "var" allows using it outside the function.)
#####################################################################################################*/
/* Template Literals
let username = "Ahmed";
let items = 3;
let total = 100;
let text = `Hello ${username},
You have ${items} items in your cart.
Your total is $${total}.`;
console.log(text);
#####################################################################################################*/
/* Temp Program
function tocel(temp){
return (temp-32)*(5/9);
    }
function tofahr(temp){
    return temp*9/5+32;
    }
document.getElementById("submit").onclick = function(){
    let temp;
    if(document.getElementById("cbutton").checked){
        temp = document.getElementById("temp").value;
        temp = Number(temp);
        document.getElementById("result").innerHTML = "Result: " + tocel(temp) + " °C";
    }
    else if(document.getElementById("fbutton").checked){
        temp = document.getElementById("temp").value;
        temp = Number(temp);
        document.getElementById("result").innerHTML = "Result: " + tofahr(temp) + " °F";
    }
    else{
        document.getElementById("result").innerHTML = "Select a Fucken Unit.";
    }
}
#####################################################################################################*/
/* Arrays
let brands = ["H&M" , "Gucci" , "Tommyhilfiger" , "Lacoste" , "Ralphlauren"];
console.log(brands);
brands[4] = "Under-armour"
console.log(brands);
brands.push("Zara"); //adds an element
console.log(brands);
brands.pop(); //removes last element
console.log(brands);
brands.unshift("Versace"); //adds an element to beginning
console.log(brands);
brands.shift(); //removes an element from beginning
console.log(brands);
console.log(brands.length);
console.log(brands.indexOf("Lacoste"));
#####################################################################################################*/
/* Sorting Strings
let fruits = ["Mango" , "Watermelon" , "Banana" , "Orange"];
fruits = fruits.sort();
console.log(fruits);
fruits = fruits.sort().reverse();
console.log(fruits);
#####################################################################################################*/
/* 2D Arrays
let fruits = ["Mango" , "Watermelon" , "Banana"];
let vegetables = ["Carrots" , "Onions" , "Potatoes"];
let meats = ["Meat" , "Chicken" , "Fish"];
let grocerylist = [fruits , vegetables , meats];
grocerylist[2][0]="Steak";
for(let list of grocerylist){
    for(let food of list){
        console.log(food);
    }
}
#####################################################################################################*/
/* Spread Operator
let brands = ["H&M" , "Gucci" , "American Eagle" , "Lacoste" , "Ralphlauren"];
let cars = ["Mercedes" , "Ferrari" , "Audi" , "BMW" , "Buggati"];
brands.push(cars);
console.log(brands);
brands.pop();
brands.push(...cars);
console.log(brands);
#####################################################################################################*/
/* forEach()
let fruits = ["mango" , "watermelon" , "banana"];
function capitalize(text){
    text=text.toUpperCase();
    return text;
}
function print(x){
    console.log(x);
}
fruits.forEach(function (fruit) {
    let capitalizedFruit = capitalize(fruit);
    print(capitalizedFruit);
  });
#####################################################################################################*/
/* arr.map()
let numbers = [1,2,3,4,5];
function sqr(x){
    return Math.pow(x,2);
}
console.log(numbers.map(sqr));
#####################################################################################################*/
/* arr.filter();
let ages = [18 , 16 , 21 , 17 , 19 , 90];
function checkage(x){
return x>=18;
}
let adults = ages.filter(checkage);
function print(x){
    console.log(x);
}
adults.forEach(print);
#####################################################################################################*/
/* Arrow Function
percent = (x,y) => x/y*100;
console.log(`${percent(37,50)}%`);
#####################################################################################################*/
/* Nested Functions
let username = "Ahmed";
let userinbox = 0;
function login(){
    displayUsername();
    displayUserinbox();
    function displayUsername(){
        console.log(`Welcome ${username}!`);
    }
    function displayUserinbox(){
        console.log(`You've ${userinbox} messages.`);
    }
}
login();
#####################################################################################################*/
/* Maps
const store = new Map([
    ["T-shirt" , 225],
    ["Jeans" , 300],
    ["Jordans" , 295],
    ["Cargo" , 350]
]);
store.set("Short" , 250);
store.forEach((value , key) => console.log(`${key} = ${value}`));
store.delete("Short");
console.log(store.has("Short"));
console.log(store.size);
console.log("---------------");
let shoppingcart = 0;
shoppingcart+=store.get("T-shirt");
shoppingcart+=store.get("Cargo");
shoppingcart+=store.get("Jordans");
console.log(`Your Cart = ${shoppingcart} EGP`);
#####################################################################################################*/
/* Literal Objects
const car1 = {
    car: "BMW",
    model: "3-series",
    year: 2023,
    color: "Dark-Blue",
    drive: function(){
        console.log("You Drive The Car!");
    },
    brake: function(){
        console.log("You Step On The Brakes!");
    }
}
const car2 = {
    car: "Mercedes",
    model: "CLA250",
    year: 2022,
    color: "Black",
    drive: function(){
        console.log("You Drive The Car!");
    },
    brake: function(){
        console.log("You Step On The Brakes!");
    }
}
console.log(car2.car);
console.log(car2.model);
console.log(car2.year);
console.log(car2.color);
car2.drive();
// We can use objects with arrays and functions like variables.
#####################################################################################################*/
/* Classes
class Student{
    constructor(name , age , gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    study(){
        console.log(`${this.name} is Studying`);
    }
}
const student1 = new Student("Ahmed" , "19" , "2.89");
const student2 = new Student("someone" , "100" , "3.4");
const student3 = new Student("Dracula" , "1000" , "2.88");
console.log(student1.name);
console.log(student2.gpa);
console.log(student3.age);
#####################################################################################################*/
/* Inheritence
class Employees{
    graduation = "CS";
    working = true;
    constructor(name){
        this.name = name;
    }
    job_description(){
        console.log(`${this.name} works as a software developer.`);
    }
}
class Employee1 extends Employees{
    class = "A";
    salary = 10000 ;
    notes(){
        console.log(`${this.name} is an Excellent Employee`);
    }
}
class Employee2 extends Employees{
    class = "B";
    salary = 7000 ;
    notes(){
        console.log(`${this.name} is a Very Good Employee`);
    }
}
class Employee3 extends Employees{
    class = "C";
    salary = 5000 ;
    notes(){
        console.log(`${this.name} is a Good Employee`);
    }
}
const Ahmed = new Employee1("Ahmed");
const Dracula = new Employee2("Dracula");
const Rambo = new Employee3("Rambo");
console.log(Ahmed.graduation);
Ahmed.notes();
console.log(Dracula.class);
console.log(Dracula.working);
console.log(Rambo.salary);
Rambo.job_description();
#####################################################################################################*/
/* Error Handling
try{
console.log(x);
}
catch{
    console.log("ERROR!");
}
try{
    x = window.prompt("Enter a Number:");
    x = Number(x);
   if(isNaN(x)) throw "That wasn't a number!";
   if(x=="") throw "That was empty!";
   console.log(x);
}
catch{
    console.log("Try Again Later!");
}
finally{
    console.log("Process Ended!");
}
#####################################################################################################*/
/* Date and Time
let date = new Date();
document.getElementById("calendar").innerHTML = formatDate(date);
function formatDate(date){
    let year = date.getFullYear();
    let month = date.getMonth()+1;
    let day = date.getDate();
    return `${day}/${month}/${year}`
}
const label = document.getElementById("clock");
function clock(){
let time = new Date();
label.innerHTML = formatTime(time);
function formatTime(time){
    let hours = time.getHours();
    let minutes = time.getMinutes();
    let seconds = time.getSeconds();
    let AMorPM = hours>=12?"PM":"AM";
    hours = (hours%12)||12;
    hours = zeroes(hours);
    minutes = zeroes(minutes);
    seconds = zeroes(seconds);
    return `${hours}:${minutes}:${seconds} ${AMorPM}`;
}
function zeroes(time){
    time = time.toString();
    return time.length<2?"0"+time:time;
}
}
clock();
setInterval(clock,1000);
#####################################################################################################*/
/* Promises
const wait = time => new Promise((resolve) => {
    setTimeout(resolve,time);
})
wait(3000).then(()=>console.log("Thanks For Waiting!"));
#####################################################################################################*/
/*DOM
console.dir(document);
console.log(document.title);
console.log(document.URL);
//document.title = "x";
//document.location=  "http://www.google.com";
#####################################################################################################*/
/* Add HTML Elements
const nametag = document.createElement("h1");
nametag.textContent = window.prompt("Enter Your Name:");
document.body.append(nametag);
#####################################################################################################*/
/* CSS Properties
const title = document.createElement("h1");
title.textContent = "This is a Title!";
document.body.append(title);
title.style.backgroundColor = "black";
title.style.color = "whitesmoke";
title.style.fontFamily = "consolas";
title.style.textAlign = "center";
title.style.border = "2px solid";
title.style.display = "block";
#####################################################################################################*/
// Events
/*const element = document.getElementById("button");
element.onclick = f1;*/
/*const element = document.body;
element.onload = f1;*/
/*const element = document.getElementById("text");
element.onchange = f1;*/
/*const element = document.getElementById("div");
element.onmouseover = f2;
element.onmouseout = f3;
element.onmousedown = f2;
element.onmouseup = f3;*/
/*function f1(){
    window.alert("You Did Something!");
}
function f2(){
    element.style.background = "darkblue";
}
function f3(){
    element.style.background = "red";
}
#####################################################################################################*/
/* Show/Hide HTML Elements
const button = document.querySelector("#button");
const img = document.querySelector("#img");
button.addEventListener("click" , () => {
    if(img.style.visibility == "hidden"){
        img.style.visibility = "visible";
    }
    else{
        img.style.visibility = "hidden";  
    }
})
#####################################################################################################*/
/* Detect Key Presses
window.addEventListener("keydown" , event => console.log(event.key));
const div = document.getElementById("div");
window.addEventListener("keydown" , move);
let x=0;
let y=0;
function move(event){
    switch(event.key){
        case "ArrowUp":
            y-=5;
            div.style.top = y+"px";
            break;
        case "ArrowDown":
            y+=5;
            div.style.top = y+"px";
            break;
        case "ArrowRight":
            x+=5;
            div.style.left = x+"px";
            break;
        case "ArrowLeft":
            x-=5;
            div.style.left = x+"px";
            break;
    }
}
#####################################################################################################*/
/* Window
console.dir(window);
console.log(window.innerWidth);
console.log(window.innerHeight);
console.log(window.outerWidth);
console.log(window.outerHeight);
console.log(window.scrollX);
console.log(window.scrollY);
console.log(window.location.href);
//window.location.href = "https://google.com";
console.log(window.location.hostname);
console.log(window.location.pathname);
window.alert("Hello!");
window.confirm("Press OK to continue...");
let username = window.prompt("Enter your username:");
console.log("Hello",username,"!");
#####################################################################################################*/
/* Cookies
console.log(navigator.cookieEnabled);
document.cookie = "firstName=Ahmed; expires=Sun, 1 Jan 2030 12:00:00 UTC; path=/";
console.log(document.cookie);
setCookie("email" , "ahmedaemara078@gmail.com" , 365);
delteCookie("firstName");
delteCookie("lastName");
delteCookie("email");
setCookie("firstName" , "Ahmed" , 365);
setCookie("lastName" , "Hassan" , 365);
getCookie("firstName");
console.log(document.cookie);
function setCookie(name , value , daysToLive){
    const date =  new Date();
    date.setTime(date.getTime() + (daysToLive * 24 * 60 * 60 * 1000));
    let expires = "expires = " + date.toUTCString();
    document.cookie = `${name} = ${value}; ${expires}; path=/`
}
function delteCookie(name){
    setCookie(name , null , null);
}
function getCookie(name){
    const cDecoded = decodeURIComponent(document.cookie);
    console.log(cDecoded);
}
#####################################################################################################*/
/* Stopwatch
const timeDisplay = document.querySelector("#timeDisplay");
const startBtn = document.querySelector("#startBtn");
const pauseBtn = document.querySelector("#pauseBtn");
const resetBtn = document.querySelector("#resetBtn");
let startTime = 0;
let elapsedTime = 0;
let currentTime = 0;
let paused = true;
let intervalId;
let hrs = 0;
let mins = 0;
let secs = 0;
startBtn.addEventListener("click" , () => {
    if(paused){
        paused = false;
        startTime = Date.now() - elapsedTime;
        intervalId = setInterval(updateTime , 1000);
    }
});
pauseBtn.addEventListener("click" , () => {
    if(!paused){
        paused = true;
        elapsedTime = Date.now() - startTime;
        clearInterval(intervalId);
    }
});
resetBtn.addEventListener("click" , () => {
    paused = true;
    clearInterval(intervalId);
    startTime = 0;
    elapsedTime = 0;
    currentTime = 0;
    hrs = 0;
    mins = 0;
    secs = 0;
    timeDisplay.textContent = "00:00:00";
});
function updateTime(){
    elapsedTime = Date.now() - startTime;
    secs = Math.floor((elapsedTime/1000)%60);
    mins = Math.floor((elapsedTime/(1000*60))%60);
    hrs = Math.floor((elapsedTime/(1000*60*60))%60);
    secs = pad(secs);
    mins = pad(mins);
    hrs = pad(hrs);
    timeDisplay.textContent = `${hrs}:${mins}:${secs}`;
    function pad(unit){
        return(("0")+unit).length > 2 ? unit : "0"+unit;
    }
}
#####################################################################################################*/
/* GET
fetch('/users?name=Ahmed&age=20')
    .then(respone => respone.json())
    .then(data => console.log(data))
    .catch(error => console.error(error));
#####################################################################################################*/
/* POST
const userData = {name : 'Ahmed' , age : 20};
fetch('users/' , {
    method : 'POST',
    body : JSON.stringify(userData),
    headers : {'Content-Type' : 'application/json'}
})
    .then(respone => respone.json())
    .then(data => console.log(data))
    .catch(error => console.error(error));
#####################################################################################################*/
/* PUT
const userData = {id : 1 , name : 'Ahmed' , age : 1000};
fetch('users/1' , {
    method : 'PUT',
    body : JSON.stringify(updatedUserData),
    headers : {'Content-Type' : 'application/json'}
})
    .then(respone => respone.json())
    .then(data => console.log(data))
    .catch(error => console.error(error));
#####################################################################################################*/
/* PATCH
const userDataPatch = new URLSearchParams();
userDataPatch.append('age' , 20);
fetch('users/1' , {
    method : 'PATCH',
    body : userDataPatch,
    headers: {'Content-Type': 'application/x-www-form-urlencoded'}
})
    .then(respone => respone.json())
    .then(data => console.log(data))
    .catch(error => console.error(error));
#####################################################################################################*/
/* DELETE
fetch('users/1' , {
    method : 'DELETE',
})
.then(response => {
    if (response.ok) {
        console.log('User deleted successfully!');
    }
    else{
        console.error('Error deleting user!');
    }
})
.catch(error => console.error(error));
#####################################################################################################*/
/* Memonizer Function
const memoize = (fn) => {
    let cache = {}
    return(...args) => {
        let cacheKey = args.map(n => n.toString() + '+').join('')
        if(cacheKey in cache){
            return cache[cacheKey]
        }
        else{
            let result = args.reduce((acc,curr) => fn(acc,curr) , 0);
            cache[cacheKey] = result;
            return result;
        }
    }
}
const add = (a,b) => a+b;
const memoizeAdd = memoize(add)
#####################################################################################################*/