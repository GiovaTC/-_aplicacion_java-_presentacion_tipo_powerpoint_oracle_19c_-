package service;

import dao.SlideDAO;
import model.Slide;

public class SlideService {

    private final SlideDAO dao = new SlideDAO();

    public void createSlide(String title, String data) throws Exception{
        Slide slide = new Slide(title, data);
        dao.save(slide);
    }
}
