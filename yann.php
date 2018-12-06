<html>
  <head>
    <title> index </title>
    <meta charset="utf-8">
  </head>
  <body>
    <script src="../JavaScript/class/Composant.js"></script>
    <script src="../JavaScript/class/Vipi.js"></script>
    <script src="../JavaScript/class/Obstacle.js"></script>
    <script src="../JavaScript/class/Cactus.js"></script>
    <script langage="javascript">
      var vipi = new Vipi(0, 0);
      document.body.appendChild(vipi.getImage());

      var test = new Cactus(1,1,200,200);
      document.body.appendChild(test.getImage());
    </script>
  </body>
</html>
