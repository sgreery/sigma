public class Lebon extends World{
    public void go() {
        background();

    }
    public void rowoftrees (){
        for (int x = 1; x < 7; x = x+1){
            tree();
            plane.turn(90);
            plane.move(100);
            plane.turn(270);
        }
    }
    public void tree (){
        plane.isTrail = true;
        plane.trailWidth = 25;
        plane.pausetime = 0;
        plane.setColor(150, 75, 0);
        plane.startingAngle(90);
        plane.move(500);
        plane.turn(90);
        plane.move(20);
        plane.turn(90);
        plane.move(500);
        plane.startingAngle(0);
        plane.isTrail = false;
        plane.move(5);
        plane.startingAngle(180);
        plane.isTrail = true;
        plane.turn(180);
        plane.setColor(25, 155, 50);
        plane.trailWidth = 50;
        for (int y = 1; y < 22; y = y +1){
            for (int x = 1; x < 9; x = x + 1){
                plane.move(1);
                plane.turn(10);
            }
            plane.turn(300);
        }
        plane.isTrail=false;
        plane.startingAngle(180);
        plane.move(50);
        plane.turn(90);
        plane.move(34);
    }
    public void grass () {
        plane.startingAngle(270);
        plane.isTrail = false;
        plane.trailWidth = 100;
        plane.move(100);
        plane.turn(270);
        plane.isTrail = true;
        plane.move(1000);

    }
    public void sky () {
        plane.teleport(0,0);
        plane.isTrail = true;
        plane.trailWidth = 800;
        plane.setColor(135,206, 235);
        plane.startingAngle(0);
        plane.move(800);




    }
    public void bird() {
        plane.startingAngle(250);
        plane.isTrail = true;

        plane.trailWidth = 5;
        for (int y = 0; y < 2; y=y+1) {
            for (int x = 0; x < 16; x = x + 1) {
                plane.move(3);
                plane.turn(10);

            }
            plane.turn(180);
        }
    }
    public void birds(int g) {
        int k = 0;
        if(g%2 == 0) {
            for (int h = 0; h < g; h = h + 1) {
                int x = plane.random(50, 1000);
                int y = plane.random(20, 300);
                plane.teleport(x, y);
                plane.setColor(255,255,255);
                bird();
            }
        }
        else {
            for (int h = 0; h < g; h = h + 1) {
                int x = plane.random(50, 1000);
                int y = plane.random(20, 300);
                plane.teleport(x, y);
                plane.setColor(0,0,0);
                bird();
            }
        }
    }
    public void pond() {
        for(int y = 0; y<50; y=y+1) {
            plane.startingAngle(0);
            for (int x = 0; x < 72; x = x + 1) {
                plane.trailWidth = 10;
                plane.setColor(75, 170, 255);
                plane.move(1);
                plane.turn(5);
            }
            plane.move(10);
        }
    }
    public void background () {
        plane.pausetime = 0;
        sky();
        plane.teleport(200, 252);
        rowoftrees();
        plane.teleport(150, 252);
        rowoftrees();
        plane.teleport(0,800);
        grass();
        plane.teleport (400, 400);
        birds(plane.random(0,100));
        plane.teleport(100,775);
        pond();
    }
    }


