let number=1;
let star="";
for(var i=1;i<=5;i++){
    var output=number;
    for(var j=1;j<i;j++){
       output+=star;
        number++;
        output+=number;
}
console.log(output);
star+="*";
number++;
}