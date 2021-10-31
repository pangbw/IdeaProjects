import java.util.Scanner;

//英雄类
class Hero {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int hp;                  //生命值
    private int attack;              //攻击力
    private int ap;                  //护甲值

    //构造方法录入英雄属性 让玩家输入英雄信息
    public Hero(String name, int hp, int attack, int ap) {
        this.setName(name);
        this.setHp(hp);
        this.setAttack(attack);
        this.setAp(ap);
    }

    //创建赋值以访问英雄属性
    public int getAp() {
        return ap;
    }

    public int getAttack() {
        return attack;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setName(String name) {
        this.name = name;
    }

}

//小兵类
class Soldier {
    private String name;
    private int hp;                  //生命值
    private int attack;              //攻击力
    private int ap;              //护甲值

    public Soldier() {

    }

    //构造方法录入小兵属性 让玩家输入小兵信息
    public Soldier(String name, int hp, int attack, int ap) {
        this.setName(name);
        this.setHp(hp);
        this.setAttack(attack);
        this.setAp(ap);
    }

    //创建赋值以访问小兵属性
    public int getAp() {
        return ap;
    }

    public int getAttack() {
        return attack;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setName(String name) {
        this.name = name;
    }

}

//装备类
class Equipment {
    private String name;
    private int hpPlus;
    private int attackPlus;
    private int apPlus;

    public Equipment() {

    }

    public Equipment(String name, int hp, int attack, int ap){
        Dlsword dlsword = new Dlsword();
        hp = hp + dlsword.getApPlus();
        attack = attack + dlsword.getAttackPlus();
        ap = ap + dlsword.getHpPlus();
        ename = dlsword.getName();
    }

    public Equipment(String name, int hpPlus, int attackPlus, int apPlus) {
        this.setName(name);
        this.setHpPlus(hpPlus);
        this.setAttackPlus(attackPlus);
        this.setApPlus(apPlus);
        this.getName();
        this.getHpPlus();
        this.getAttackPlus();
        this.getApPlus();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHpPlus(int hpPlus) {
        this.hpPlus = hpPlus;
    }

    public void setAttackPlus(int attackPlus) {
        this.attackPlus = attackPlus;
    }

    public void setApPlus(int apPlus) {
        this.apPlus = apPlus;
    }

    public int getHpPlus() {
        return hpPlus;
    }

    public int getAttackPlus() {
        return attackPlus;
    }

    public int getApPlus() {
        return apPlus;
    }

    public String getName() {
        return name;
    }

}

//主类  拥于完成出装，战斗。
public class HYTime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //选择英雄并输入信息
        System.out.print("英雄名称：");
        String name = sc.next();
        System.out.print("英雄血量：");
        int hp = sc.nextInt();
        System.out.print("英雄攻击力：");
        int attack = sc.nextInt();
        System.out.print("英雄防御力：");
        int ap = sc.nextInt();
        Hero player = new Hero(name, hp, attack, ap);
        name = player.getName();
        hp = player.getHp();
        attack = player.getAttack();
        ap = player.getAp();
        equip(name, hp, attack, ap);
    }

    //出装方法
    public static void equip(String name, int hp, int attack, int ap) {
        Scanner sc = new Scanner(System.in);
        String ename = null;
        System.out.println("请选择出装:(1.多兰剑；2.多蓝盾；3.多兰戒)");
        int eq = sc.nextInt();
        switch (eq) {
            default:
                System.out.println("请在给出的装备中选择！");
            case 1:

            case 2:

        }
        System.out.println("已装备" + ename);
        System.out.println("目前：英雄血量：" + hp + "英雄攻击力：" + attack + "英雄防御力：" + ap);
    }

}

//步兵子类
class Infantry extends Soldier {
    private static void main(String[] args) {
        //实例化对象步兵并录入属性
        Soldier infantry = new Soldier("步兵", 445, 12, 2);
    }
}

//弓箭手子类
class Archer extends Soldier {
    private Archer(String[] args) {
        //实例化对象弓箭手并录入属性
        Soldier archer = new Soldier("弓箭手", 295, 25, 1);
    }
}

//炮车子类
class Camion extends Soldier {
    private Camion(String[] args) {
        //实例化对象炮车并录入属性
        Soldier camion = new Soldier("炮车", 100, 40, 15);
    }
}

//热武器子类
class Gun extends Equipment {
    private Gun(String[] args) {
        //实例化对象热武器并录入属性
        Equipment gun = new Equipment("热武器", 300, 50, 40);
    }
}

//多兰剑子类
class Dlsword extends Equipment {
    public Dlsword() {
        //实例化对象多兰剑并录入属性
        Equipment dlsword = new Equipment("多兰剑", 0, 25, 0);
        //特性：每次攻击回复25点血量；

    }
}