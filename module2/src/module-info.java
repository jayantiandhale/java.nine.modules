module module2 {
    //exports org.jayantiandhale;
    requires module1;

    //to create compile time only dependency
    //requires static common.module3;
}