package chapter7.enums;

public class EnumsWithMethods {

    enum Color {
        RED(255, 0, 0) {
            @Override
                //Optional
            String getColorSet() {
                return String.format("%d:%d:%d", getRed(), getGreen(), getBlue());
            }
        },
        BLUE(0, 0, 255) {
            String getColorSet() {
                return String.format("%d:%d:%d", getRed(), getGreen(), getBlue());
            }
        },
        YELLOW(255, 255, 0) {
            String getColorSet() {
                return String.format("%d:%d:%d", getRed(), getGreen(), getBlue());
            }
        };

        private final int red;
        private final int green;
        private final int blue;

        Color(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        /* when abstract everything need to implement this method in the enum */
        abstract String getColorSet();

        public int getRed() {
            return red;
        }

        public int getGreen() {
            return green;
        }

        public int getBlue() {
            return blue;
        }
    }

    enum Colors {
        RED(255, 0, 0) {
            @Override
            String getColorSet() {
                return "Custom implementation of it!";
            }
        },
        BLUE(0, 0, 255),
        YELLOW(255, 255, 0);

        private final int red;
        private final int green;
        private final int blue;

        Colors(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        String getColorSet() {
            return String.format("%d:%d:%d", red, green, blue);
        }
    }

    public static void main(String[] args) {
        var color = Color.RED;
        System.out.println(color.getColorSet());

        var colors = Colors.BLUE;
        System.out.println(colors.getColorSet());

        colors = Colors.RED;
        System.out.println(colors.getColorSet());
    }

}
