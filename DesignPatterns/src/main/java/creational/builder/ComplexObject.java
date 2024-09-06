package creational.builder;

public class ComplexObject {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    private ComplexObject() {}

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void setD(String d) {
        this.d = d;
    }

    public void setE(String e) {
        this.e = e;
    }

    public void setF(String f) {
        this.f = f;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        // same fields as in ComplexObject
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;

        private Builder() {}

        public Builder withA(String a) {
            this.a = a;
            return this;
        }

        public Builder withB(String b) {
            this.b = b;
            return this;
        }

        public Builder withC(String c) {
            this.c = c;
            return this;
        }

        public Builder withD(String d) {
            this.d = d;
            return this;
        }

        public Builder withE(String e) {
            this.e = e;
            return this;
        }

        public Builder withF(String f) {
            this.f = f;
            return this;
        }

        public ComplexObject build() {
            ComplexObject o = new ComplexObject();

            o.setA(a);
            o.setB(b);
            o.setC(c);
            o.setD(d);
            o.setE(e);
            o.setF(f);

            return o;
        }
    }

    @Override
    public String toString() {
        return "ComplexObject{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                ", e='" + e + '\'' +
                ", f='" + f + '\'' +
                '}';
    }
}
