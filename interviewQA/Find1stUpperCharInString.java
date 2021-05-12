class Find1stUpperCharInString {

    public static void main(String[] args) {
        
        String sample ="acBcD";
        System.out.println(findUpperCharIndex(sample));
    }

    public static Integer findUpperCharIndex(String test){
        Integer pos=null;
        for(int i=0;i<=test.length();i++){
            if(Character.isUpperCase(test.charAt(i))) {
                pos =i;
                break;
            }
        }
        return pos;
    }
}