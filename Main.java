class Info {
    int v;
    double s;
    int p;
    int q;

    Info(int v, double s, int p, int q) {
        v = v;
        s = s;
        p = p;
        q = q;
    }
}

class Calc {
    Info[] infos;

    Calc(Info[] infos) {
        infos = infos;
    }

    int calc() {
        double d = density();
        int ql = queue();

        if (d > 0.6 && ql > 12) {
            return 35;
        } else if (d > 0.4 && ql > 8) {
            return 25;
        } else {
            return 15;
        }
    }

    double density() {
        double tv = 0;
        double ts = 0;
        for (Info i : infos) {
            tv += i.v;
            ts += i.s;
        }
        return tv / ts;
    }

    int queue() {
        int tq = 0;
        for (Info i : infos) {
            tq += i.q;
        }
        return tq;
    }
}

class Main {
    public static void main(String[] args) {
        Info[] infos = {
            new Info(12, 32.5, 6, 12),
            new Info(20, 42.0, 10, 20),
            new Info(28, 50.5, 14, 28)
        };

        Calc calc = new Calc(infos);

        int signalDuration = calc.calc();

        System.out.println("Optimized signal duration: " + signalDuration + " seconds");
    }
}