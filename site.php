<html>
  <head>
    <script type="text/javascript" src="JavaScript/class/Composant.js"></script>
    <script type="text/javascript" src="JavaScript/class/Obstacle.js"></script>
    <script type="text/javascript" src="JavaScript/class/Cactus.js"></script>
  </head>
  <body>
    <p>Welcome to JavaScript</p>
    <form>
      <input type="button" value="click" onclick="init()"/>
    </form>
  </body>
</html>
<script>
      function init(){
        var test = new Cactus(1,1,1,10);
        alert(test.getPosition_x());
        test.setPosition_x(5);
        alert(test.getPosition_x());
        document.body.appendChild(test.getImage());
      }
</script>
