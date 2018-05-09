package com.flame239.slitherio;

import java.util.Deque;

public class Snake {

    final int id;
    final String name;
    double x, y;
    int dir;
    double wang, ang;
    double sp, tsp;
    private double fam;
    final Deque<SnakeBodyPart> body;
    private final MySlitherModel model;

    public Snake(int id, String name, double x, double y, double wang, double ang, double sp, double fam, Deque<SnakeBodyPart> body, MySlitherModel model) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.dir = 0;
        this.wang = wang;
        this.ang = ang;
        this.sp = sp;
        tsp = 0;
        this.fam = fam;
        this.body = body;
        this.model = model;
    }

    private double getSc() {
        return Math.min(6, 1 + (body.size() - 2) / 106.0);
    }

    public double getScang() {
        return 0.13 + 0.87 * Math.pow((7 - getSc()) / 6, 2);
    }

    public double getSpang() {
        return Math.min(sp / model.spangdv, 1);
    }

    private double getFsp() {
        return model.nsp1 + model.nsp2 * getSc();
    }

    public boolean isBoosting() {
        return tsp > getFsp();
    }

    public double getFam() {
        return fam;
    }

    public void setFam(double fam) {
        this.fam = fam;
    }
}
