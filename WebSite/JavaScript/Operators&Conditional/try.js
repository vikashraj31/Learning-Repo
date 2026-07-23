console.log("Hellow");


//Arithmetic Operators
let a=6;
let b=4;
console.log("a = ",a,  "b = ",b);

console.log("Add value = ", a+b); // let x =a+b  or dircet 

console.log("Multi = ",  a*b);
console.log("a**b (a power b) =",a**b);



console.log("Final Value of A = ",a++);
console.log("Final Value of A = ",a);
console.log("Final Value of A = ",--a);


// //comparison Operators

let c =7;
let d = 5;
console.log("Final ans of C==D is ",c==b); // this show this is true aur false
console.log("FINAL ANS OF C NOT EQUAL TO D IS = ",c!=b); // this show this is true aur false


let e=10; // this is number 
let f="6" // but this is string becaue for ""

console.log("10==6", e==f); // yaha pr jo string wala value hai usko string -> number me convert hota hai phir codition check hota hai
// // agr hm chahte hai ki string-> number X me connvert na to to usme strict types use krte hai jaise ===, !===



let g=7; // this is number 
let h="6" // but this is string becaue for ""
console.log("7===6", g===h); //yaha pr strict checking



// //logical operators
let i=9;
let j=2;
console.log("7===6", g===h);     


// //Conditional statements

let age=25;
if(age>18){
    console.log("Now you can Vote");
}else{
    console.log("not vote");
}


//Ternary Operators
let size =18;
let r = size >=18? "Big" : "small";
console.log(r);


// Question

let score = prompt("Enter your number"); //prompt is use to take input
score = Number(score); // Convert input from string to number
let grade;

if (score >= 90 && score <= 100) {
    grade = "A+";
} else if (score >= 80 && score <= 89) {
    grade = "A";
} else if (score >= 70 && score <= 79) {
    grade = "B+";
} else if (score >= 60 && score <= 69) {
    grade = "B";
} else {
    grade = "F"; // Optional: Handle scores below 60
}

console.log("Grade:", grade);








 