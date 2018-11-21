let initial=0;
let n=9;
let final=1;
console.log(0);
let array=[];
array[0]=0;
let firstString='0(Even)';
for (var i = 1; i <=n; i++) {
     output=final+initial;
     final=initial;
     initial=output;
     array[i]=output;
    console.log(array[i]);
    if(array[i]%2==0){
        firstString+=','+array[i]+'(Even)'
    }
    else{
        firstString+=','+array[i]+'(Odd)'
    }
    


}
// let string=array.join(',')
console.log(firstString);