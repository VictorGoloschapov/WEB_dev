const tasks = [
  {
    _id: '5d2ca9e2e03d40b326596aa7',
    completed: true,
    body:
      'Occaecat non ea quis occaecat ad culpa amet deserunt incididunt elit fugiat pariatur. Exercitation commodo culpa in veniam proident laboris in. Excepteur cupidatat eiusmod dolor consectetur exercitation nulla aliqua veniam fugiat irure mollit. Eu dolor dolor excepteur pariatur aute do do ut pariatur consequat reprehenderit deserunt.\r\n',
    title: 'Eu ea incididunt sunt consectetur fugiat non.',
  },
  {
    _id: '5d2ca9e29c8a94095c1288e0',
    completed: false,
    body:
      'Aliquip cupidatat ex adipisicing veniam do tempor. Lorem nulla adipisicing et esse cupidatat qui deserunt in fugiat duis est qui. Est adipisicing ipsum qui cupidatat exercitation. Cupidatat aliqua deserunt id deserunt excepteur nostrud culpa eu voluptate excepteur. Cillum officia proident anim aliquip. Dolore veniam qui reprehenderit voluptate non id anim.\r\n',
    title:
      'Deserunt laborum id consectetur pariatur veniam occaecat occaecat tempor voluptate pariatur nulla reprehenderit ipsum.',
  },
  {
    _id: '5d2ca9e2e03d40b3232496aa7',
    completed: true,
    body:
      'Occaecat non ea quis occaecat ad culpa amet deserunt incididunt elit fugiat pariatur. Exercitation commodo culpa in veniam proident laboris in. Excepteur cupidatat eiusmod dolor consectetur exercitation nulla aliqua veniam fugiat irure mollit. Eu dolor dolor excepteur pariatur aute do do ut pariatur consequat reprehenderit deserunt.\r\n',
    title: 'Eu ea incididunt sunt consectetur fugiat non.',
  },
  {
    _id: '5d2ca9e29c8a94095564788e0',
    completed: false,
    body:
      'Aliquip cupidatat ex adipisicing veniam do tempor. Lorem nulla adipisicing et esse cupidatat qui deserunt in fugiat duis est qui. Est adipisicing ipsum qui cupidatat exercitation. Cupidatat aliqua deserunt id deserunt excepteur nostrud culpa eu voluptate excepteur. Cillum officia proident anim aliquip. Dolore veniam qui reprehenderit voluptate non id anim.\r\n',
    title:
      'Deserunt laborum id consectetur pariatur veniam occaecat occaecat tempor voluptate pariatur nulla reprehenderit ipsum.',
  },
];

(function(arrOfTasks) {
  //transfer array to object of objects
  let objectOfTasks = arrOfTasks.reduce((acc, task) => {
    acc[task._id] = task;
    return acc;
  }, {})

  //Elements UI
  let listContainer = document.querySelector(".tasks-list-section .list-group", );

  let form = document.forms["addTask"];
  let inputTitle = form.elements["title"];
  let inputBody = form.elements["body"];

  //events
  renderAllTasks(objectOfTasks);
  form.addEventListener("submit", onFormSubmitHandler);

  //display all task on page
  function renderAllTasks(tasksList) {
    if (!tasksList) {
      console.error("Передайте список задач");
      return;
    }

    //create html fragment
    let fragment = document.createDocumentFragment();
    Object.values(tasksList).forEach(task => {
      let li = listItemTemlapte(task);
      fragment.appendChild(li);
    });
    listContainer.appendChild(fragment);
  }

  function listItemTemlapte({_id, title, body} = {}) {
    let li = document.createElement("li");
    li.classList.add('list-group-item', 'd-flex', 'align-items-center', 'flex-wrap', 'mt-2');

    let span = document.createElement("span");
    span.textContent = title;
    span.style.fontWeight = "bold";

    let deleteBtn = document.createElement("button");
    deleteBtn.classList.add('btn', 'btn-danger', 'ml-auto', 'delete-btn');
    deleteBtn.textContent = "Delete task";

    let article = document.createElement("p");
    article.textContent = body;
    article.classList.add('mt-2', 'w-100');

    li.appendChild(span);
    li.appendChild(deleteBtn);
    li.appendChild(article);

    return li;
  }

  function onFormSubmitHandler(e) {
    e.preventDefault();
    let titleValue = inputTitle.value;
    let bodyValue = inputBody.value;

    if (!titleValue || !bodyValue) {
      alert("Пожалуйста введите заголовок и задачу");
      return;
    }

    let task = createNewTask(titleValue, bodyValue);
    let listItem = listItemTemlapte(task);

    listContainer.insertAdjacentElement("afterbegin", listItem);
    form.reset();
  }

  function createNewTask(title, body) {
    let newTask = {
      title,
      body,
      completed: false,
      _id: `task-${Math.random()}`,
    };

    //delete test
    console.log(newTask);

    objectOfTasks[newTask._id] = newTask;
    return {...newTask};
  }
})(tasks);