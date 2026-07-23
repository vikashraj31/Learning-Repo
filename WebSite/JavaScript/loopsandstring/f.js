age=21;
console.log(age);

for(let i=0; i<5;i++){
    console.log("Vikash");
}

//sum
let sum=0;
for(let i=0; i<=5;i++){
    sum=sum+i;
}
console.log("sum is",sum);


//while loop
let NO=1;
while(NO<=4){
    console.log("i = ",NO);
    NO++;
}



//do while loop
let a=5;
do{
    console.log("I is = ",a)
    a++;
}while(a<=6);


//for of loop 
let str="mrvikash";
for(let namekaletter of str){
    console.log("value= ",namekaletter); 
}

let student = {
    name: "Ram",
    roll: 24052557,
    cgpa: 7.8
};

for (let key in student) {
    console.log(key + " → " + student[key]);
}

//Qestion prrint the 0 to 100
for (let i = 0; i <= 100; i++) {
    if (i % 2 === 0) {
        console.log("number is =", i);
    }
}



//Guess the Numbe
let n = 33;
// let userno = Number(prompt("Guess the number"));

// while (userno !== n) {
//   userno = Number(prompt("Wrong! Try again"));
// }

console.log("Yes, this matches!");


//NEW CHAPTER Strings

let stri = "Vikash";

//propertic
stri.length/// this use to find lenght 
// striing is work like array so we can use 
stri[0],stri[3]// to print the element of the index
console.log(stri[4]);

//Template Literals in JS
const product = "Laptop";
const price = 75000;
console.log(`The ${product} costs ₹${price}.`); // yah sb kuch ek line me trint krne me help krta hai


const user = {
  firstName: "Rahul",
  lastName: "Sharma",
  age: 28
};

console.log(`${user.firstName} ${user.lastName}, Age: ${user.age}.`);



console.log("Vikash \nRaj "); // \n for next line or \t 




