function StringChallenge(sen) { 
    var str = sen.replace(/[^a-zA-Z0-9]/g," ");
    var strArr=str.split(" ");
    var token = "my4oucwh23b";
    var tokenArr = token.split("");
    var len = strArr.length;
    for(var i =0;i<strArr.length;i++){
      for(var j=i+1;j<strArr.length-1;j++){
        if(strArr[i].length>strArr[j].length || strArr[i].length==strArr[j].length){
          var temp = strArr[j];
          strArr[j]=strArr[i];
          strArr[i]=temp;
        }
  
      }
    }
    var finalStr=strArr[len-1];
    var finalRes=finalStr.split("");
    // var finalRes="";
   
    var match=false;
  for(var i =0;i<finalRes.length;i++){
    for(var j = 0; j<tokenArr.length;j++){
      if(tokenArr[j]===finalRes[i]){
  finalRes.push("-");
      }
  
    }
  
    
  }
    // code goes here  
    return finalRes; 
  
  }
     
  // keep this function call here 
  console.log(StringChallenge(readline()));