public class Main {

    public static void main(String[] args) {
        Car granta = new Car();
        granta.brand = "Lada";
        granta.model = "Granta";
        granta.productionYear = 2015;
        granta.origin = "Россия";
        granta.color = "желтый";
        granta.engineVolume = 1.7;
        System.out.println(
                "Марка автомобиля "+granta.brand+
                ", модель "+granta.model+
                ", год выпуска "+granta.productionYear+
                ", страна производства "+granta.origin+
                ", цвет "+granta.color+
                ", обЪем двигателя "+granta.engineVolume
        );
                
        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50L TOT quatro";
        audi.productionYear = 2020;
        audi.origin = "Германия";
        audi.color = "черный";
        audi.engineVolume = 3.0;
        System.out.println(
                "Марка автомобиля "+audi.brand+
                ", модель "+audi.model+
                ", год выпуска "+audi.productionYear+
                ", страна производства "+audi.origin+
                ", цвет "+audi.color+
                ", обЪем двигателя "+audi.engineVolume
        );

        Car BMW = new Car();
        BMW.brand = "BMW";
        BMW.model = "Z8";
        BMW.productionYear = 2022;
        BMW.origin = "Германия";
        BMW.color = "черный";
        BMW.engineVolume = 3.0;
        System.out.println(
                "Марка автомобиля "+BMW.brand+
                ", модель "+BMW.model+
                ", год выпуска "+BMW.productionYear+
                ", страна производства "+BMW.origin+
                ", цвет "+BMW.color+
                ", обЪем двигателя "+BMW.engineVolume
        );

        Car Kia = new Car();
        Kia.brand = "Kia";
        Kia.model = "Sportage 4 поколения";
        Kia.productionYear = 2018;
        Kia.origin = "Южная Корея";
        Kia.color = "красный";
        Kia.engineVolume = 2.4;
        System.out.println(
                "Марка автомобиля "+Kia.brand+
                ", модель "+Kia.model+
                ", год выпуска "+Kia.productionYear+
                ", страна производства "+Kia.origin+
                ", цвет "+Kia.color+
                ", обЪем двигателя "+Kia.engineVolume
        );

        Car hyandai = new Car();
        hyandai.brand = "Hyandai";
        hyandai.model = "Avante";
        hyandai.productionYear = 2016;
        hyandai.origin = "Южная Корея";
        hyandai.color = "оранжевый";
        hyandai.engineVolume = 1.6;
        System.out.println(
                "Марка автомобиля "+hyandai.brand+
                ", модель "+hyandai.model+
                ", год выпуска "+hyandai.productionYear+
                ", страна производства "+hyandai.origin+
                ", цвет "+hyandai.color+
                ", обЪем двигателя "+hyandai.engineVolume
        );



    }


}