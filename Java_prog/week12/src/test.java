<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
    <script>
        var date = new Date();
        var hour = date.getHours();

        if(hour < 12) {
            alert("오전입니다");
        }

        if (hour >=12)
        {
            alert("오후입니다");
        }   
    </script>
</body>
</html>

