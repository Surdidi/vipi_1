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
    <script src="../JavaScript/class/Buisson.js"></script>

    <script src="../JavaScript/class/Mob.js"></script>
    <script src="../JavaScript/class/Taupe.js"></script>
    <script src="../JavaScript/class/Serpent.js"></script>
    <script langage="javascript">
      var vipi = new Vipi(0, 0);
      document.body.appendChild(vipi.getImage());

      var cactus = new Cactus(1,1);
      document.body.appendChild(cactus.getImage());

      var buisson = new Buisson(1,1);
      document.body.appendChild(buisson.getImage());

      var taupe = new Taupe(1,1);
      document.body.appendChild(taupe.getImage());

      var serpent = new Serpent(1,1);
      document.body.appendChild(serpent.getImage());
    </script>
  </body>
</html>
