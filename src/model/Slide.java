package model;

public class Slide {

    private int id;
    private String title;
    private String chartData;

    public Slide(String title, String chartData) {
        this.title = title;
        this.chartData = chartData;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getChartData() {
        return chartData;
    }
}
