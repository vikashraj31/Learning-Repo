console.log("Hellow World");

age =22;
// also we can write age+1 , so age is 23

name ="Vikash Raj";

x= null;
y=undefined;

let nameFull = "VIKASH RAJ"; // value can change 
const no =7294165849; // for fix value 


//Block scope
const student={
    Name:"Vikash", // key : value(name : Vikash)
    age:21,
    cgpa:8,
    ispass: true,
    last: "Raj"
};

console.log(student);// all details print

console.log(student.age); // if me use student. than no need of '' OR  ""
console.log(student["age"]); 


student["age"] = student["age"]+1

student["Name"] = "Vikash Raj" // update the name of object


// Notes
// conts ko update nhi kr skte 
// let ko update kr skte hai 
// conts object or let objet ko update kr skte hai 
// Object me key:value use krte hai (key=value) aise use nhi kr skte hai 
