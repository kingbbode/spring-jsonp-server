Kingbbode - Spring JSONP SERVER
===============================

> response josnp server

---

-	*2016-12-18*  
-	[Kingbbode Git Page](http://kingbbode.github.io)

---

TEST HTML

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Kingbbode</title>
    <script
    src="https://code.jquery.com/jquery-2.2.4.min.js"
    integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
    crossorigin="anonymous"></script>
  </head>
  <body>
    <script>
    var url = 'http://localhost:9000/';
    var static_json = 'http://localhost:9000/json/test.json'
    $.ajax({
      url: static_json,
      dataType: 'jsonp',
      jsonpCallback: "myCallback",
      success: function(data){
        console.log('ajax', data);
      }
    });

    $.getJSON(url + "?callback=?", function(data){
      console.log('getJSON', data);
    });
    </script>
  </body>
</html>
```