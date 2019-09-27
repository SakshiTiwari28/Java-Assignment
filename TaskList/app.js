// Define ui var 

const form = document.querySelector('#task-form');
const taskList = document.querySelector('.collection');
const clrBtn = document.querySelector('.clear-tasks');
const filter = document.querySelector('#filter');
const taskInput = document.querySelector('#task')

//Load all Event Listeners

loadEventlistener();

function loadEventlistener(){

    //Dom event Listener

    document.addEventListener('DOMContentLoaded',getTasks)
    //Add task event
    form.addEventListener('submit', addTask)

    //Remove task events
    taskList.addEventListener('click' ,removeTask)

    //clear task
    clrBtn.addEventListener('click' ,clearTask)

    //filter tasks
    filter.addEventListener('keyup' ,filterTask)
}


//Get tasks for LS


//Add Task
function addTask(e){
    if(taskInput.value === ''){
        alert('Add a Task');
    }
    // create li element 

    const li = document.createElement('li')
    li.className ='collection-item';

    li.appendChild(document.createTextNode(taskInput.value))

    const link = document.createElement('a');
    link.className ='delete-item secondary-content'
    link.innerHTML = '<i class= "fa fa-remove"></i>'

    li.appendChild(link)

    taskList.appendChild(li)

    //Store in local Storage

    storeTaskInLocalStorage(taskInput.value);


    taskInput.value = '';

    e.preventDefault();
}

function getTasks(){

    let tasks;
    if(localStorage.getItem('tasks')===null){
       tasks =[];
    }
    else{
        tasks =JSON.parse(localStorage.getItem('tasks'));
    }

    tasks.forEach(function(task){

        const li = document.createElement('li')
        li.className ='collection-item';
    
        li.appendChild(document.createTextNode(task))
    
        const link = document.createElement('a');
        link.className ='delete-item secondary-content'
        link.innerHTML = '<i class= "fa fa-remove"></i>'
    
        li.appendChild(link)
    
        taskList.appendChild(li)
    
    })

}

 //Store in Local Storage

   function storeTaskInLocalStorage(task){
       let tasks;
       if(localStorage.getItem('tasks')===null){
          tasks =[];
       }
       else{
           tasks =JSON.parse(localStorage.getItem('tasks'))
       }
       tasks.push(task)
       localStorage.setItem('tasks',JSON.stringify(tasks))
   }

   //Remove Task
function removeTask(e){
    if(e.target.parentElement.classList.contains('delete-item')){
        if(confirm("Are you sure?")){
        e.target.parentElement.parentElement.remove();
        removeTaskFromLocalStorage(e.target.parentElement.parentElement)
    }
  }

}

function removeTaskFromLocalStorage(taskItem){
    let tasks;
    if(localStorage.getItem('tasks')===null){
       tasks =[];
    }
    else{
        tasks =JSON.parse(localStorage.getItem('tasks'))
    }
    tasks.forEach(function(task,index){
        if(taskItem.textContent === task){
            tasks.splice(index,1)
        }
    })
    localStorage.setItem('tasks' ,JSON.stringify(tasks))
}

function clearTask(e){
   // taskList.innerHTML = '';

   while(taskList.firstChild){
       taskList.removeChild(taskList.firstChild)
   }

   clearTaskFromLocalStorage()
}

function clearTaskFromLocalStorage(){
    localStorage.clear();
}


function filterTask(e){

    let text = e.target.value.toLowerCase();

    document.querySelectorAll('.collection-item').forEach
    ( function (task){
            const item = task.firstChild.textContent;
            if(item.toLowerCase().indexOf(text)!=-1){
                task.style.display ='block'

            }
            else{
                task.style.display='none';
            }
        }
    )
    console.log(text);
}