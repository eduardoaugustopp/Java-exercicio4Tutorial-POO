����   = [
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  Digite seu nome: 
      java/io/PrintStream print (Ljava/lang/String;)V
     ! nextLine ()Ljava/lang/String; # 
Digite sua idade: 
  % & ' nextInt (I)I )  
Digite seu gÃªnero (M ou F): 
  + , ! next
 . / 0 1 2 java/lang/String charAt (I)C   4 5 6 makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String;
  8 9  println  ; 5 < (I)Ljava/lang/String;  > 5 ? (C)Ljava/lang/String; A Mcom/java/intermediario/associacaoArrayComObjetos/test/Test04_leituraDoTeclado Code LineNumberTable main ([Ljava/lang/String;)V 
SourceFile Test04_leituraDoTeclado.java BootstrapMethods J
 K L M 5 N $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; P Nome:  R Idade:  T GÃªnero:  InnerClasses W %java/lang/invoke/MethodHandles$Lookup Y java/lang/invoke/MethodHandles Lookup ! @           B        *� �    C        	 D E  B   �     ^� Y� 	� L� � +� M� "� +� $>� (� +� *� -6� ,� 3  � 7� � :  � 7� � =  � 7�    C   .    	          &  .  8  D  P  ]   F    G H     I  O I  Q I  S U   
  V X Z 