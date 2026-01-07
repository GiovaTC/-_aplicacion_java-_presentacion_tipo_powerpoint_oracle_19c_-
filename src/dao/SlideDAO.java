package dao;

import model.Slide;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class SlideDAO {

    public void save(Slide slide) throws Exception {
        String sql = "INSERT INTO slides(title, chart_data) VALUES (?, ?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, slide.getTitle());
            ps.setString(2, slide.getChartData());
            ps.executeUpdate();
        }
    }
}
