package ui;

import service.SlideService;
import javax.swing.*;

public class SlideFrame extends JFrame {

    private final SlideService service = new SlideService();

    public SlideFrame() {
        setTitle("Presentación - PowerPoint Java");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ChartPanel chart = new ChartPanel();
        JButton saveBtn = new JButton("Guardar diapositiva");

        saveBtn.addActionListener(e -> {
            try {
                service.createSlide(
                        "Diapositiva 1",
                        "40,70,55,90"
                );
                JOptionPane.showMessageDialog(
                        this,
                        "Diapositiva guardada en Oracle"
                );
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        add(chart, "Center");
        add(saveBtn, "South");
    }
}
