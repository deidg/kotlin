class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока" 
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        //weaponSlots = new Weapon[7]
        String[] weapon = new String[6];
               weapon[0] = "BigGun";
               weapon[1] = "WaterPistol";
               weapon[2] = "Tamagawk";
               weapon[3] = "Hammer";
               weapon[4] = "Lazer";
               weapon[5] = "RocketLuncher";
        };

//    public int weaponCount() {
//        // length - позволяет узнать, сколько всего слотов с оружием у игрока
//        return weapon.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль

        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }
}