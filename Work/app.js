document.getElementById('one').addEventListener('click',rewardCalculator)
document.getElementById('two').addEventListener('click',amountCalculator)
document.getElementById('enter').addEventListener('blur',calculate)

function rewardCalculator(e){

    document.getElementById('credit').style.display = "block"
    document.getElementById('amount').style.display = "none"
    e.preventDefault()
} 

function amountCalculator(e){

    document.getElementById('amount').style.display = "block"
    document.getElementById('credit').style.display = "none"
    e.preventDefault();
}

// function getData(){

// var output = ''
//     fetch('data.json')
//         .then(res=>{
//             return res.json()
//        })
//           .then(data=>{
         
//            data.forEach(data=>{
//                output += `${data.reward}`
//            })
//          console.log(output)
      
//        })

//     return output
// }


function calculate(e){

    let output = e.target.value
    if((output) % 5 !==0){
     output = Math.floor(output/5)*5;
    }
    document.getElementById('enter').value = output

    let out = ''
    fetch('data.json')
        .then(res=>{
            return res.json()
         })
        .then(data=>{
         
           data.forEach(data=>{
           out += `${data.reward}`
        })
       
    console.log(out)

    
    if(output >= out){
         alert(`You dont have ${output} credits`)
         console.log('Invalid entry')
    }
      else{
         document.getElementById('get').value = output * 5
     }
  
 // document.getElementById('get').value = output * 5
    
   })

}

