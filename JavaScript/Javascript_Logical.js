//1.1
function isEven(n) {
    n = Number(n);
    return n === 0 || !!(n && !(n%2));
    }
    function isOdd(n) {
    return isEven(Number(n) + 1);
    }
    
    //1.2
    Math.max(1, 2, 3);
    Math.max(1, 3, 2);
    Math.max(3, 2, 1);
    
    
    //2.1
    var fourNums=[];
    undefined
    fourNums[0]=0.871570877817405;
    fourNums[1]=0.9107447521970577;
    fourNums[2]=0.743357509580703;
    fourNums[3]=0.6571292972456975;
    
    //2.2
    var arr = [];
    while(arr.length < 5){
        var r = Math.floor(Math.random() * 100) + 1;
        if(arr.indexOf(r) === -1) arr.push(r);
    }
    console.log(arr);
    
    //2.3
    var stringArray = ["1.2", "2.3", "3.4"];
    var numberArray = stringArray.map(Number);
    console.log(numberArray);
    
    //2.4
    function findLongestWord(str) {
      return str.length;
    }
    findLongestWord("ababcdababefgababhiab");
    findLongestWord("aba");
    
    
    //3.2
    var x = 5;
      console.log(x);
      // expected output: 5
    
    //3.3
    function half(x) {
      return(x / 2);
      }
    
    //3.5
    function seven() {
      x = 7;
      return(x);
      }
    
    //3.6
    function three_numbers(x, y, z) {
        return (a + b)/c;
      }
    console.log(three_numbers(1, 1, 0));
    console.log(three_numbers(-1, -1, 0));
    console.log(three_numbers(1, -1, 0));
    
    //3.8
    const number = prompt("Enter a number: ");
    //check if the number is even
    if(number % 2 == 0) {
        console.log("True.");
    }
    // if the number is odd
    else {
        console.log("False.");
    }
    
    
    