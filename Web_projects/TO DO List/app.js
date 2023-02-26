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
  //transfer array "tasks" to object of objects "objectOfTasks"
  let objectOfTasks = arrOfTasks.reduce((acc, task) => {
    acc[task._id] = task;
    return acc;
  }, {})

  let themes = {
    default: {
      '--base-text-color': '#212529',
      '--header-bg': '#007bff',
      '--header-text-color': '#fff',
      '--default-btn-bg': '#007bff',
      '--default-btn-text-color': '#fff',
      '--default-btn-hover-bg': '#0069d9',
      '--default-btn-border-color': '#0069d9',
      '--danger-btn-bg': '#dc3545',
      '--danger-btn-text-color': '#fff',
      '--danger-btn-hover-bg': '#bd2130',
      '--danger-btn-border-color': '#dc3545',
      '--input-border-color': '#ced4da',
      '--input-bg-color': '#fff',
      '--input-text-color': '#495057',
      '--input-focus-bg-color': '#fff',
      '--input-focus-text-color': '#495057',
      '--input-focus-border-color': '#80bdff',
      '--input-focus-box-shadow': '0 0 0 0.2rem rgba(0, 123, 255, 0.25)',
    },
    dark: {
      '--base-text-color': '#212529',
      '--header-bg': '#343a40',
      '--header-text-color': '#fff',
      '--default-btn-bg': '#58616b',
      '--default-btn-text-color': '#fff',
      '--default-btn-hover-bg': '#292d31',
      '--default-btn-border-color': '#343a40',
      '--default-btn-focus-box-shadow':
        '0 0 0 0.2rem rgba(141, 143, 146, 0.25)',
      '--danger-btn-bg': '#b52d3a',
      '--danger-btn-text-color': '#fff',
      '--danger-btn-hover-bg': '#88222c',
      '--danger-btn-border-color': '#88222c',
      '--input-border-color': '#ced4da',
      '--input-bg-color': '#fff',
      '--input-text-color': '#495057',
      '--input-focus-bg-color': '#fff',
      '--input-focus-text-color': '#495057',
      '--input-focus-border-color': '#78818a',
      '--input-focus-box-shadow': '0 0 0 0.2rem rgba(141, 143, 146, 0.25)',
    },
    light: {
      '--base-text-color': '#212529',
      '--header-bg': '#fff',
      '--header-text-color': '#212529',
      '--default-btn-bg': '#fff',
      '--default-btn-text-color': '#212529',
      '--default-btn-hover-bg': '#e8e7e7',
      '--default-btn-border-color': '#343a40',
      '--default-btn-focus-box-shadow':
        '0 0 0 0.2rem rgba(141, 143, 146, 0.25)',
      '--danger-btn-bg': '#f1b5bb',
      '--danger-btn-text-color': '#212529',
      '--danger-btn-hover-bg': '#ef808a',
      '--danger-btn-border-color': '#e2818a',
      '--input-border-color': '#ced4da',
      '--input-bg-color': '#fff',
      '--input-text-color': '#495057',
      '--input-focus-bg-color': '#fff',
      '--input-focus-text-color': '#495057',
      '--input-focus-border-color': '#78818a',
      '--input-focus-box-shadow': '0 0 0 0.2rem rgba(141, 143, 146, 0.25)',
    },
  };

  let lastSelectedTheme = "default";

  //Elements UI
  let listContainer = document.querySelector(".tasks-list-section .list-group", );
  let form = document.forms["addTask"];
  let inputTitle = form.elements["title"];
  let inputBody = form.elements["body"];
  let themeSelect = document.getElementById("themeSelect");

  //events
  renderAllTasks(objectOfTasks);
  form.addEventListener("submit", onFormSubmitHandler);
  listContainer.addEventListener("click", onDeleteHandler);
  themeSelect.addEventListener("change", onThemeSelectHandler);

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
    li.setAttribute("data-task-id", _id);

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

    objectOfTasks[newTask._id] = newTask;
    return {...newTask};
  }

  //delete tasks
  function onDeleteHandler(e) {
    if (e.target.classList.contains("delete-btn")) {
      let parent = e.target.closest('[data-task-id]');
      let id = parent.dataset.taskId;
      let confirmed = deleteTask(id);
      deleteTaskHtml(confirmed, parent);
    }
  }

  function deleteTask(id) {
    let {title} = objectOfTasks[id]
    let isConfirm = confirm(`Точно вы хотите удалить задачу: ${title}`);

    if (!isConfirm) {
      return isConfirm;
    }

    delete objectOfTasks[id];
    return isConfirm;
  }

  function deleteTaskHtml(confirmed, el) {
    if (!confirmed) {
      return;
    }
      el.remove();
  }

  function onThemeSelectHandler(e) {
    let selectedTheme = themeSelect.value;
    let isConfirmed = confirm(`Выдействительно хотите изменить тему на: ${selectedTheme}?`);

    if (!isConfirmed) {
      themeSelect.value = lastSelectedTheme;
      return ;
    }

    setTheme(selectedTheme);
    lastSelectedTheme = selectedTheme;
  }

  function setTheme(name) {
    let selectedThemeObject = themes[name];
    Object.entries(selectedThemeObject).forEach(([key, value]) => {
      document.documentElement.style.setProperty(key, value);
    })
  }
})(tasks);
