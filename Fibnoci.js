let initial=1;
let n=10;
let final=1;
console.log(0);
console.log(1);
for (var i = 2; i <=n; i++) {
     output=final+initial;
     final=initial;
     initial=output;
    console.log(output);
}
