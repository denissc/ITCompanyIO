# Задание по финальному проекту Java Core.

Необходимо реализовать консольное приложение, которое позволяет выполнять CRUD операции со всем сущностями, указанными выше, сохраняя связи между ними (Developer имеет Set Skills и т.д.)

## Сущности:
 - Developer
 - Skill
 - Team
 - Project
 - Customer
 - Company

 Customer - клиент компании.
 Company - компания, которая предоставляет услуги.

## Связи
 - Developer -> Set\<Skill> skills 
 - Team -> Set\<Developer> developers
 - Project -> Set\<Team> teams
 - Customer -> Set\<Project> projects
 - Company -> Set\<Customer> customers


Приложение должно быть разбито на пакеты (model, dao, controller, view).
Все данные должны сохраняться в текстовый файл (по аналогии с заданием по Java I/O).
Связи между объектами необходимо реализовать с помощью идентификаторов (id) каждого объекта в каждом текстовом файле.

# Запуск
AppRunner медот main