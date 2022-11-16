package proxy;

public class ProxyMagician implements Subject {
    private RealSubject proxyTarget;

    public ProxyMagician(RealSubject proxyTarget) {
        this.proxyTarget = proxyTarget;
    }

    @Override
    public void getPermission() {
        // Deny access unless ID is > 100
        // If level is higher return magic ability

        //Lower level of magic
        if (this.proxyTarget.getId() >= 100 && 200>= this.proxyTarget.getId()){
            this.proxyTarget.getPermission();
            System.out.println("Secret Cure Hiccups Potion" + "\nIngredients:" + "\nDragon liver" + "\nMouse eyes");
            System.out.println("Magic level: New Necromancer");
            //Mid-level of magic
        } else if(this.proxyTarget.getId() >= 201 && 300>= this.proxyTarget.getId()){
            this.proxyTarget.getPermission();
            System.out.println("Secret Run Faster Potion" + "\nIngredients:" + "\nFour leaf clover" + "\nTurtle toenails");
            System.out.println("Magic level: Well-equipped Witch");
            //High level of magic
        }else if(this.proxyTarget.getId() >= 301){
            this.proxyTarget.getPermission();
            System.out.println("Sorcerer's very Secret Teleportation Potion" + "\nIngredients:" + "\nUnicorn Horn" + "\nLavender" + "\nBat's tooth");
            System.out.println("Magic level: Sage Sorcerer");
        } else {
            System.out.println("You don't have any magic ability!");
        }
    }
}
