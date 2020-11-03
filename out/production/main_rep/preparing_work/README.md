<h1> Условие first_task </h1>

<img src="https://sun9-31.userapi.com/FXw4GcBuGzbtm7AaKQw_Kcbx2yGyO4B6XKkJzg/e7v70ItwBpk.jpg" width="600">

<h1> Реализация </h1>
<h2> Main - запуск файла, worker - родитель, full_worker и hour_worker - потомки со своими реализациями</h2>

Есть два режима: свои данные и анализ "из файла". Примеры обоих:

<img src="https://sun9-5.userapi.com/PqNnueCYSiF5VzHWwa3RuaqcImogbcg9w9ZWNA/OjoXI1w0C_0.jpg"  width="500">
<h3> Результат сортировок </h3> 
Примечание: первые строки - это топ5 и анти-топ3, а последний список с общими сведениями - это весь список.
<img src="https://sun9-26.userapi.com/rek7EWmis3uDGvzi826J3_pHWclZ19ddB3ufaQ/zHe_HPxrOaM.jpg" width="200">

<h3> Считаем с файла данные (хоть это и те же данные, так как была запись в файл) </h3>
<img src="https://sun2-3.userapi.com/b8gUnGJbLZ7hKxzqREMTd0D5om2AEa9cxOLxXQ/YrXiLllbOw4.jpg"  width="200">
<h3> Результат сортировок </h3> 
<img src="https://sun9-50.userapi.com/2pAkPKmPMAhj3h-zoBqnDdYuqY2alUwvgaLq8w/PV9QXUIUv5Q.jpg"  width="200">

<h1> Условие second_task </h1>

<img src="https://sun9-27.userapi.com/dbBMhuFMq184kajRMYU66p7qVDtIhlfpUZohEg/Otuxq_Dykts.jpg"  width="600">

<h1> Реализация </h1>

<img src="https://sun9-53.userapi.com/8SGkudj6DjgUTGyok6jZ9_MMyaXgoGh7xgZepg/FW041PG9eK8.jpg">

+ <b>Main</b>- запуск кода для "показа"
+ <b>Card,Fix_card,One_pay_Card</b> - классы карт (родитель и потомки со своими реализациями)
+ <b>Payment,Mobile_pay,ATM</b> - способы работы (с телефона или банкомата, где родитель - абстрактный Payment)
+ <b>Money_processing</b> - вспомогательный класс, реализующий работу с деньгами
+ <b>Terminal</b> - все, что касается терминальной оплаты
+ <b>Info</b> - вспомогательный класс для вычислений

<h3> Пример работы с картой </h3> 
<img src="https://sun9-28.userapi.com/jx83XSOQ64tzZx2LxGk6OiJq-_GCBPY6vU_-vg/Xg6rpI7CFoQ.jpg" width="600">
<img src="https://sun9-2.userapi.com/KEUAte9XZfrSXiOOk7ESvfCJjh9vdXA91Fa_Sg/1xcIFw9OpfU.jpg" width="600">
<img src="https://sun9-58.userapi.com/YbiZjFVGgfCaNiB3jdyG2kU05qc3DPpVaFg8QA/-mL4qbvDOac.jpg" width="600">
<img src="https://sun9-32.userapi.com/0rCr-XwCgLnW_S54M0m9Wk8pn3ISW_zZpqc1Nw/yPZyyvU7T78.jpg" width="600">

<h3> Пример работы с терминалом </h3> 

Инициализируем 5 рандомных карточек:

<img src="https://sun9-20.userapi.com/eNWOrZD_UXLIwTNGl6LtlufiFKdhkRZinEF21Q/sESyD6c8wpk.jpg" width="600">

Результат:

<img src="https://sun9-3.userapi.com/4aheBne2KL-tHZPiIJaKU87-M0h18heEYcTLVQ/0_KI5PgLNM4.jpg" width="200">
