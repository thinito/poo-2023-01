package com.github.thinito.poo.t11;

class Janela {
    private double area;
    public Janela(double area) {
        this.area = area;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
}

class JanelaComVidro extends Janela {
    private double areaVidro;
    public JanelaComVidro(double area, double areaVidro) {
        super(area);
        this.areaVidro = areaVidro;
    }
    public double getAreaVidro() {
        return areaVidro;
    }
    public void setAreaVidro(double areaVidro) {
        this.areaVidro = areaVidro;
    }
    public double getAreaRestante() {
        return getArea() - areaVidro;
    }
    public static void janela(String[] args) {
        Janela janelaSemVidro = new Janela(10.0);
        JanelaComVidro janelaComVidro = new JanelaComVidro(20.0, 5.0);
        System.out.println("Área da janela sem vidro: " + janelaSemVidro.getArea());
        System.out.println("Área da janela com vidro: " + janelaComVidro.getArea());
        System.out.println("Área do vidro da janela com vidro: " + janelaComVidro.getAreaVidro());
        System.out.println("Área restante da janela com vidro: " + janelaComVidro.getAreaRestante());
    }
}

