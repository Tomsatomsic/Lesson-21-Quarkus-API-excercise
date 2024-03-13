package cz.spsmb.DTO;

public class CarDTO {

            String brand;
            long id;

            int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
                return brand;
            }

            public void setBrand(String brand) {
                this.brand = brand;
            }

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }


            @Override
            public String toString() {
                return "AnimalDTO{" +
                        "text='" + brand + '\'' +
                        ", id='" + id + '\'' +
                        ", price='" + price + '\'' +
                        '}';
            }
        }






