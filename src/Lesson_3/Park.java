package Lesson_3;

public class Park{
    private String park;

    static class Attraction{
        private String slides;
        private int time;
        private int price;

        public Attraction(String slides, int time, int price) {
        }

        public Attraction() {

        }

        public void setTime(int time) {
            this.time = time;
        }

        public void setPrice(int price) {
            this.price = price;
        }
        public void setSlides(String slides){
            this.slides=slides;
        }

        public String getSlides() {
            return slides;
        }

        public int getTime() {
            return time;
        }

        public int getPrice() {
            return price;
        }
    }

    public Park(String park){
        this.park=park;
    }

    public String getPark(){
        return park;
    }

}