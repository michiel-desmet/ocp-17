module zoo.animal.talks {
    exports zoo.animal.talks.content to zoo.staff; //Hiermee geef je aan waar deze gebruikt kan worden.
    exports zoo.animal.talks.media;
    exports zoo.animal.talks.schedule;

    requires transitive zoo.animal.care;
}
