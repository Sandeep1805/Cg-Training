//Q1 
var c = "Sandeep";
console.log(c + " intial Value"); //Sandeep
c = "D S"; // Changing the value of const c :
//Q2 : 
var str = "Sandeep";
Q2(str);
function Q2(str) {
    if (str.length > 0) {
        let strres = str.split(" ");
        console.log(strres);
    }
    else {
        console.log("String is less than 0");
    }
}
//Q3 :
var Order = {
    id: 11,
    title: 'order',
    price: 1000,
    printOrder() {
        return (this.id + " " + this.title + " " + this.price);
    },
    getPrice() {
        return (this.price);
    }
};
var order1 = Object.assign(Order); //creating a new object from the existing object using Object.assign()
console.log(order1.printOrder()); //10 order 100
console.log(order1.getPrice()); //100
order1.id = 20; //changing the value of id
order1.title = 'order1'; //changing the value of title
order1.price = 200; //changing the value of price
console.log(order1.printOrder()); //20 order1 200
console.log(order1.getPrice()); //200
//Q4 :
let names = ['Max', 'peter', 'Harry'];
var Q4 = (names) => {
    let res = names.map((n) => { let r = { name: n, length: n.length }; return (r); });
    return res;
};
console.log(Q4(names));
//Q5 :
function add(a, b = 10) {
    return (a + b);
}
console.log(add(10, 40));
console.log(add(10));
function userFriends(username, ...arg) {
    console.log("Name: " + username);
    console.log("userFriends: ");
    for (var i in arg) {
        console.log(arg[i]);
    }
}
userFriends("Muller", "Max", "Harry", "Peter");
let arr = ["Ayush", "Guru", "Sandeep", "Saurabh", "Akash"];
userFriends("Uday", ...arr);
function printCapitalNames(...names) {
    console.log("Names after");
    for (var i in names) {
        console.log(names[i].toUpperCase());
    }
}
printCapitalNames(...arr);
//Q6 :
function laptop(model, deskno, name) {
    console.log(`The  laptop is From :${model}, desk no:${deskno},name:${name}`);
}
laptop("Dell", "2205", "Sandeep");
//Q7 
var [e1, e2, e3, e4] = arr;
console.log(e3);
let organization = {
    Name: "Google",
    adress: {
        city: "Chennai",
        state: "Tamilnadu",
        pincode: 600071
    }
};
let { adress: { pincode: p } } = organization;
console.log(p);