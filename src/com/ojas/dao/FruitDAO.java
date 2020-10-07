package com.ojas.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.ojas.model.Fruit;
public class FruitDAO {
	public boolean addFruit(Fruit reg) {
        boolean isFruitAdded = false;
        Connection con = ConnectionFactory.getConnection();
        try {
            PreparedStatement pst = con.prepareStatement("insert into fruit values(?,?,?,?,?,?)");
            pst.setString(1, reg.getName());
            pst.setString(2,reg.getAddress());
            pst.setString(3, reg.getEmail());
            pst.setString(4, reg.getFruitid());
            pst.setString(5,reg.getFruitname());
            pst.setString(6,reg.getBrouncher());
             int a = pst.executeUpdate();
            if (a > 0) {
                isFruitAdded = true;
            } else {
                isFruitAdded = false;
            }
        } catch (Exception e) {
            System.out.println(e);

 

        }
        return isFruitAdded;
	

}
	public ArrayList<Fruit> listFruits() {
        // boolean b=false;
        Connection con = ConnectionFactory.getConnection();
        ArrayList<Fruit> listFruits = new ArrayList<>();
        try {
            PreparedStatement pst = con.prepareStatement("select * from fruit");
            ResultSet res = pst.executeQuery();
            
            while (res.next()) {
                Fruit obj = new Fruit(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6));
                listFruits.add(obj);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

 

        return listFruits;
    }
}
