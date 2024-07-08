class space {
    
    public static void main(String[] args) {
        
        String str="ab text";
        char[] charstr=str.toCharArray();
        str="";
        for(char s:charstr){
            if(s==' ')
                continue;
            str+=s+" ";
        }
        System.out.println(str);
        
        
    }
}
