git add .\filename.txt **- добавляет файл в отслеживаемые**

git init **- инициализирует git в папке**

git commit -m "message" **- создаёт commit с сообщением**

git log **- просмотр прошлых commit'ов с сообщениями к ним**

git checkout code **- просмотр commit'а по его коду или по названию ветки**

git status **- проверка текущего статуса будущего commit'а**

git branch BranchName **- создать ветку с определённым названием**

git branch **- проверить существующие ветки**

git branch  -d BranchName **- удалить ветку с определенным названием**

git merge BranchName **- обновление текущей ветки до состояния ветки BranchName**

git clone ссылка_на_репозиторий **- копирование репозитория с гитхаба**

git remote add origin ссылка_на_удалённый_репозиторий **- указывает на какой репозиторий необходимо будет отправлять изменения, где origin это название удалённого репозитория**

git branch -M main **- указывает главную ветку**

git push -u origin main **- "пушит" изменения с ветки main на удалённый репозиторий origin**

git pull **- вытягивает изменения с удалённого репозитория и сливает с имеющимися файлами**
