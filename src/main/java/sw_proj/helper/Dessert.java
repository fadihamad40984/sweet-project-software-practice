package sw_proj.helper;

import sw_proj.usermanagement.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Dessert {
    private String name;
    private String type;
    private String price;

    public List<Dessert> searchdessert;

    public DataBase dataBase = new DataBase();
    private String status;
    private String statussearch;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addDessert(Dessert dessert) throws SQLException {
                dataBase.saveDessertToFile("Desserts.json",dessert);
                setStatus("Dessert added successfully");
    }

    public void search_filter(String name_type , String filter) throws SQLException {
        List<Dessert> Alldesserts = dataBase.loadDessertFromFile("Desserts.json");
        searchdessert = new ArrayList<>();
        if(Objects.equals(filter, "alphabet")){

            for(int i=0 ; i<Alldesserts.size();i++)
            {
                if(Objects.equals(name_type, Alldesserts.get(i).getName()))
                {
                    Dessert dessert = new Dessert();
                    dessert.setName(Alldesserts.get(i).getName());
                    dessert.setType(Alldesserts.get(i).getType());
                    searchdessert.add(dessert);
                    setStatussearch("Dessert search successfully");
                    searchdessert.stream()
                            .sorted(Comparator.comparing(Dessert::getName))
                            .forEach(System.out::println);
                    //System.out.println(Alldesserts.get(i).getName() +"\n" + Alldesserts.get(i).getType());
                }

                else if(Objects.equals(name_type, Alldesserts.get(i).getType()))
                {
                    Dessert dessert = new Dessert();
                    dessert.setName(Alldesserts.get(i).getName());
                    dessert.setType(Alldesserts.get(i).getType());
                    searchdessert.add(dessert);
                    setStatussearch("Dessert search successfully");

                    searchdessert.stream()
                            .sorted(Comparator.comparing(Dessert::getName))
                            .forEach(System.out::println);
                    //System.out.println(Alldesserts.get(i).getName() +"\n" + Alldesserts.get(i).getType());
                }
            }
        }

        else
        {
            for(int i=0 ; i<Alldesserts.size();i++)
            {
                if(Objects.equals(name_type, Alldesserts.get(i).getName()))
                {
                    Dessert dessert = new Dessert();
                    dessert.setName(Alldesserts.get(i).getName());
                    dessert.setType(Alldesserts.get(i).getType());
                    searchdessert.add(dessert);
                    setStatussearch("Dessert search successfully");

                    searchdessert.forEach(System.out::println);
                    //System.out.println(Alldesserts.get(i).getName() +"\n" + Alldesserts.get(i).getType());
                }

                else if(Objects.equals(name_type, Alldesserts.get(i).getType()))
                {
                    Dessert dessert = new Dessert();
                    dessert.setName(Alldesserts.get(i).getName());
                    dessert.setType(Alldesserts.get(i).getType());
                    searchdessert.add(dessert);
                    setStatussearch("Dessert search successfully");
                    searchdessert.forEach(System.out::println);
                    //System.out.println(Alldesserts.get(i).getName() +"\n" + Alldesserts.get(i).getType());
                }
            }
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Dessert{name='" + name + "', type='" + type + "'}";
    }

    public String getStatussearch() {
        return statussearch;
    }

    public void setStatussearch(String statussearch) {
        this.statussearch = statussearch;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
