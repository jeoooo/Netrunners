package com.example.netrunners;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MyData {

    // Temp store search data

    public static String search;

    public static String[] categories = {
            "Motherboard",
            "Graphics Card",
            "Monitor",
            "Router",
            "Keyboard",
            "Printer",
            "Power Supply",
            "Table",
            "Mouse",
            "Headset",
            "RAM",
            "PC Case",
            "External Storage",
            "Cable",
            "Hard Drive/SSD",
            "Chair",
            "Project",
            "Processor"
    };

    // Images

    private static int[] motherboardImages = {
            R.drawable.motherboard_1,
            R.drawable.motherboard_2,
            R.drawable.motherboard_3,
            R.drawable.motherboard_4,
            R.drawable.motherboard_5
    };

    private static int[] graphicsCardImages = {
            R.drawable.graphics_card_1,
            R.drawable.graphics_card_2,
            R.drawable.graphics_card_3,
            R.drawable.graphics_card_4,
            R.drawable.graphics_card_5,
            R.drawable.graphics_card_6,
            R.drawable.graphics_card_7
    };

    private static int[] monitorImages = {
            R.drawable.monitor_1,
            R.drawable.monitor_2,
            R.drawable.monitor_3,
            R.drawable.monitor_4
    };

    private static int[] routerImages = {
            R.drawable.router_1,
            R.drawable.router_2,
            R.drawable.router_3
    };

    private static int[] keyboardImages = {
            R.drawable.keyboard_1,
            R.drawable.keyboard_2,
            R.drawable.keyboard_3,
            R.drawable.keyboard_4,
            R.drawable.keyboard_5,
            R.drawable.keyboard_6,
            R.drawable.keyboard_7,
            R.drawable.keyboard_8
    };

    private static int[] printerImages = {
            R.drawable.printer_1,
            R.drawable.printer_2,
            R.drawable.printer_3,
            R.drawable.printer_4
    };

    private static int[] powerSupplyImages = {
            R.drawable.power_supply_1,
            R.drawable.power_supply_2,
            R.drawable.power_supply_3,
            R.drawable.power_supply_4,
            R.drawable.power_supply_5,
            R.drawable.power_supply_6
    };

    private static int[] tableImages = {
            R.drawable.table_1,
            R.drawable.table_2,
            R.drawable.table_3
    };

    private static int[] mouseImages = {
            R.drawable.mouse_1,
            R.drawable.mouse_2,
            R.drawable.mouse_3,
            R.drawable.mouse_4,
            R.drawable.mouse_5
    };

    private static int[] headsetImages = {
            R.drawable.headset_1,
            R.drawable.headset_2,
            R.drawable.headset_3,
            R.drawable.headset_4,
            R.drawable.headset_5
    };

    private static int[] ramImages = {
            R.drawable.ram_1,
            R.drawable.ram_2,
            R.drawable.ram_3,
            R.drawable.ram_4,
            R.drawable.ram_5,
            R.drawable.ram_6,
            R.drawable.ram_7,
            R.drawable.ram_8,
            R.drawable.ram_9,
            R.drawable.ram_10
    };

    private static int[] pcCaseImage = {
            R.drawable.pc_case_1,
            R.drawable.pc_case_2,
            R.drawable.pc_case_3,
            R.drawable.pc_case_4,
            R.drawable.pc_case_5
    };

    private static int[] externalStorageImages = {
            R.drawable.external_storage_1,
            R.drawable.external_storage_2,
            R.drawable.external_storage_3,
            R.drawable.external_storage_4
    };

    private static int[] cableImages = {
            R.drawable.cable_1,
            R.drawable.cable_2,
            R.drawable.cable_3,
            R.drawable.cable_4,
            R.drawable.cable_5,
            R.drawable.cable_6,
            R.drawable.cable_7,
            R.drawable.cable_8,
            R.drawable.cable_9
    };

    private static int[] storageImages = {
            R.drawable.storage_1,
            R.drawable.storage_2,
            R.drawable.storage_3,
            R.drawable.storage_4,
            R.drawable.storage_5,
            R.drawable.storage_6,
            R.drawable.storage_7,
            R.drawable.storage_8
    };

    private static int[] chairImages = {
            R.drawable.chair_1,
            R.drawable.chair_2,
            R.drawable.chair_3
    };

    private static int[] projectorImages = {
            R.drawable.projector_1
    };

    private static int[] processorImages = {
            R.drawable.processor_1,
            R.drawable.processor_2,
            R.drawable.processor_3,
            R.drawable.processor_4,
            R.drawable.processor_5,
            R.drawable.processor_6,
            R.drawable.processor_7
    };

    // Product Name

    private static String[] motherboardText = {
            "ROG Strix B550-E Gaming AMD AM4 (3rd Gen Ryzen) ATX Gaming Motherboard", // $280.00
            "ASRock B550M STEEL LEGEND AM4 AMD B550 SATA 6Gbs Micro ATX AMD Motherboard", // $151.00
            "ASUS AM4 TUF Gaming X570-Plus (Wi-Fi) ATX Motherboard", // $190.00
            "ASUS PRIME Z490-A LGA 1200 Intel Z490 SATA 6Gbs ATX Intel Motherboard", // $212.00
            "ASUS ROG STRIX Z490-E GAMING LGA 1200 Intel Z490 SATA 6Gbs ATX Intel Motherboard" // $300.00
    };

    private static double[] motherboardPrice = {
            280.00,
            151.00,
            190.00,
            212.00,
            300.00
    };

    private static String[] graphicsCardText = {
            "ASUS Dual GeForce RTX 2080", // $1200.00
            "Asus ROG Strix RTX 2060 Super-8GB", // $735
            "MSI GeForce RTX 2060", // $670.00
            "MSI GeForce RTX 2070 SUPER", // $690.00
            "Nvidia GeForce RTX 3070", // $499.00
            "Nvidia GeForce RTX 3080", // $699.00
            "Nvidia GeForce RTX 3090" // $1499.00
    };

    private static double[] graphicsCardPrice = {
            1200.00,
            735.00,
            670.00,
            690.00,
            499.00,
            699.00,
            1499.00
    };

    private static String[] monitorText = {
            "ASUS ProArt Display PA248QV 24.1 WUXGA 1920 x 1200 1610 Professional Monitor", // $196.00
            "ASUS TUF Gaming VG328H1B 32 Full HD 1920 x 1080 165Hz (OC) 1ms (MPRT) HDMI VGA Extreme Low Motion Blur FreeSync Flicker-Free Built-in Speakers Backlit LED Curved Gaming Monitor", // $300.00
            "MSI Optix MAG270VC2 27 Full HD 1920 x 1080 1ms (MPRT) 165 Hz HDMI, DisplayPort FreeSync (AMD Adaptive Sync) Curved Gaming Monitor", // $250.00
            "SAMSUNG C32JG56 32 WQHD 2560 x 1440 2K Resolution 144Hz 2x HDMI, DisplayPort Flicker-Free AMD FreeSync Eco Saving Plus Widescreen LED Backlit Curved Gaming Monitor" // $380.00
    };

    private static double[] monitorPrice = {
            196.00,
            300.00,
            250.00,
            380.00
    };

    private static String[] routerText = {
            "ASUS ROG (GT-AC2900) Dual-Band Wireless Gigabit Wi-Fi Gaming Router - GeForce NOW Optimization with Triple-Level Game Acceleration, 4 x LAN, 1 x USB 3.0, 1 x USB 2.0 Compatible with AiMesh", // $200.00
            "NETGEAR Nighthawk Pro Gaming 6-Stream WiFi 6 Router (XR1000) - AX5400 Wireless Speed (up to 5.4Gbps)  DumaOS 3.0 Optimizes Lag-Free Server Connections  4 x 1G Ethernet and 1 x 3.0 USB Ports", // $400.00
            "NETGEAR Smart WiFi Router with Dual Band Gigabit for Amazon EchoAlexa - AC1750 (R6400)" // $110.00
    };

    private static double[] routerPrice = {
            200.00,
            400.00,
            110.00
    };

    private static String[] keyboardText = {
            "ASUS TUF Gaming K7 Optical-mech Gaming Keyboard with Linear Switch, Detachable Wrist Rest, IP56 Waterproof Standard and Aura Sync RGB Lighting", // $121.00
            "CORSAIR K57 RGB WIRELESS Gaming Keyboard with SLIPSTREAM WIRELESS Technology, Backlit RGB LED, Black", // $90.00
            "Corsair Gaming K55 RGB Keyboard, Backlit RGB LED", // $50.00
            "Logitech G213 Prodigy Gaming Keyboard with 16.8 Million Lighting Colors", // $40.00
            "Logitech G610 Orion Red, Mechanical Gaming Keyboard with White LED", // $60.00
            "Logitech G915 Lightspeed Wireless RGB Mechanical Gaming Keyboard With Clicky Switch", // $240.00
            "Razer BlackWidow X Ultimate - Backlit Mechanical Gaming Keyboard with Military Grade Metal Construction", // $190.00
            "Razer Ornata Chroma - RGB Mecha-Membrane Gaming Keyboard with Mid-Height Keycaps - RZ03-02040200-R3U1" // $94.00
    };

    private static double[] keyboardPrice = {
            121.00,
            90.00,
            50.00,
            40.00,
            60.00,
            240.00,
            190.00,
            94.00
    };

    private static String[] printerText = {
            "Brother MFC-J491DW Wireless Color All-in-One Inkjet Printer with Mobile Device and Duplex Printing", // $121.00
            "Canon PIXMA TR4520 ESAT (Black) Approx. 8.8 ipm Black Print Speed Wireless InkJet MFC  All-In-One Color Printer - Black", // $100.00
            "HP ENVY Photo 7155 Wireless All-In-One Color Inkjet Printer", // $180.00
            "HP OfficeJet Pro 8035 Wireless All-In-One Color Inkjet Printer - Basalt - Includes 8 months of Instant Ink" // $200.00
    };

    private static double[] printerPrice = {
            121.00,
            100.00,
            180.00,
            200.00
    };

    private static String[] powerSupplyText = {
            "CORSAIR CV Series CV650 CP-9020211-NA 650W ATX12V 80 PLUS BRONZE Certified Non-Modular Power Supply", // $60.00
            "CORSAIR CX-M Series CX650M 650W 80 PLUS BRONZE Haswell Ready ATX12V & EPS12V Semi-Modular Power Supply CP-9020103-NA", // $94.00
            "CORSAIR VS Series VS500 500W 80 PLUS Certified Non-Modular ATX Power Supply, CP-9020223-NA", // $43.00
            "EVGA 450 BR 100-BR-0450-K1 450W ATX12V  EPS12V 80 PLUS BRONZE Certified Non-Modular Power Supply", // $40.00
            "EVGA 500 W1 100-W1-0500-KR 80+ WHITE 500W Power Supply", // $40.00
            "EVGA SuperNOVA 650 G5, 80 Plus Gold 650W, Fully Modular, Eco Mode with FDB Fan, 10 Year Warranty, Includes Power ON Self Tester, Compact 150mm Size, Power Supply 220-G5-0650-X1" // $105.00
    };

    private static double[] powerSupplyPrice = {
            60.00,
            94.00,
            43.00,
            40.00,
            40.00,
            105.00
    };

    private static String[] tableText = {
            "Clutch Ergonomic 66 BlackWhite Gaming Desk", // $360.00
            "Clutch Ergonomic L-Shaped Black White Gaming Desk", // $570.00
            "Clutch Ergonomic U-Shaped Gaming Desk (Black White)" // $900.00
    };

    private static double[] tablePrice = {
            360.00,
            570.00,
            900.00
    };

    private static String[] mouseText = {
            "Corsair DARK CORE RGB PRO CH-9315411-NA Black 8 Buttons 1 x Wheel USB 2.0 Type-A SLIPSTREAMBluetooth Wireless, Wired Optical 18000 dpi FPSMOBA Gaming Mouse, Backlit RGB LED", // $80.00
            "Logitech G102 (G203) IC PRODIGY 8000DPI 1000Hz Polling Rate 16.8M Color RGB Gaming Mouse - Black", // $30.00
            "Logitech G502 LIGHTSPEED Wireless Gaming Mouse with HERO Sensor and Tunable Weights", // $50.00
            "Razer Basilisk Essential Wired RGB Gaming Mouse 6400DPI Optical Sensor 8 Programmable Buttons Ergonomic Design", // $39.00
            "Razer DeathAdder Ergonomic PC Gaming Mouse" // $29.00
    };

    private static double[] mousePrice = {
            80.00,
            30.00,
            50.00,
            39.00,
            29.00
    };

    private static String[] headsetText = {
            "Corsair HS60 PRO SURROUND 3.5mm Connector Circumaural Gaming Headset, Carbon", // $62.00
            "HyperX Cloud Stinger Wired Gaming Headset (HX-HSCS-BKNA)", // $43.00
            "Logitech G432 3.5mm USB Connector Circumaural 7.1 Surround Sound Wired Gaming Headset", // $40.00
            "Logitech G733 Circumaural LIGHTSPEED Wireless RGB Gaming Headset", // $120.00
            "Razer Kraken Series Headset Gaming Headphone Ultralight 7.1 Stereo Sound Compatible With PC Mac Xboxone PS4 Nintendo Switch" // $55.00
    };

    private static double[] headsetPrice = {
            62.00,
            43.00,
            40.00,
            120.00,
            55.00
    };

    private static String[] ramText = {
            "Crucial 32GB (2 x 16GB) 260-Pin DDR4 SO-DIMM DDR4 3200", // $93.00
            "Crucial 8GB 260-Pin DDR4 SO-DIMM DDR4 3200", // $32.00
            "Crucial Ballistix RGB 3200 MHz DDR4 DRAM Desktop Gaming Memory Kit 16GB (8GBx2)", // $64.00
            "G.SKILL Ripjaws Series 32GB (2 x 16GB) 260-Pin DDR4 SO-DIMM DDR4 2666", // $105.00
            "G.SKILL Ripjaws V Series 16GB (2 x 8GB) 288-Pin DDR4 SDRAM DDR4 3600", // $62.00
            "G.SKILL TridentZ RGB Series 32GB (2 x 16GB) 288-Pin DDR4 SDRAM DDR4 3200", // $140.00
            "HyperX FURY 16GB (2 x 8GB) 288-Pin DDR4 SDRAM DDR4 2666", // $70.00
            "HyperX FURY 32GB (4 x 8GB) 288-Pin DDR4 SDRAM DDR4 3200", // $168.00
            "HyperX Fury RGB 32GB (2 x 16GB) DDR4 3466MHz", // $169.00
            "XPG SPECTRIX D50 RGB Desktop Memory 32GB (2x16GB) DDR4 3000MHz" // $110.00
    };

    private static double[] ramPrice = {
            93.00,
            32.00,
            64.00,
            105.00,
            62.00,
            140.00,
            70.00,
            168.00,
            169.00,
            110.00
    };

    private static String[] pcCaseText = {
            "NZXT H210 - Mini-ITX PC Gaming Case", // $95.00
            "NZXT H510 - Compact ATX Mid-Tower PC Gaming Case", // $69.00
            "NZXT H510 Elite - Premium Mid-Tower ATX Case PC Gaming Case", // $155.00
            "NZXT H510i - Compact ATX Mid -Tower PC Gaming Case", // $86.00
            "NZXT H710 - ATX Mid Tower PC Gaming Case" // $143.00
    };

    private static double[] pcCasePrice = {
            95.00,
            69.00,
            155.00,
            86.00,
            143.00
    };

    private static String[] externalStorageText = {
            "ORICO External SATA SSD Hard Drive 1TB SSD 128GB 256GB 512GB SATA SSD Portable Solid State Drive with Type C USB 3.1 Gen-2 (10Gbs) High-speed Portable SATA SSD", // $58.00
            "Seagate 2TB Backup Plus Slim Portable External Hard Drive USB 3.0 STHN2000402 Light Blue + 1Yr Mylio Create + 2MO Adobe CC Photography", // $68.00
            "Seagate Portable Hard Drive 4TB HDD - External Expansion for PC Windows PS4 & Xbox - USB 2.0 & 3.0 Black (STEA4000400)", // $97.00
            " WD Black 5TB P10 Game Drive Portable External Hard Drive for PS4Xbox OnePCMac USB 3.2 (WDBA3A0050BBK-WESN)" // $120.00
    };

    private static double[] externalStoragePrice = {
            58.00,
            68.00,
            97.00,
            120.00
    };

    private static String[] cablesText = {
            "Omni Gear HDMI-2-HDMI 6 ft. Black HDMI to HDMI 2.0 Cable (4K Ultra HD) Male to Male - OEM", // $5.00
            "Rosewill RCNC-12002 3 ft. Cat 6A Black Shielded Screened Shielded Twist Pairing (SSTP) Enhanced 550MHz Network Ethernet Cables", // $6.00
            "Rosewill U2-AM-MICROB5M-6-BK Black 6 ft. USB Type A to Type Micro B 5-Pin Cable", // $6.00
            "StarTech.com DP14MM2M DisplayPort 1.4 Cable - 6.6 ft  2m - VESA Certified - 8K@60Hz - HBR3 - HDR - DP to DP Monitor Cable - 8K DisplayPort Cable", // $19.00
            "StarTech.com MXT101 6 ft. VGA Monitor Extension Cable - HD15 MF", // $10.00
            "StarTech.com HD2VGAA2 HDMI to VGA Adapter - With Audio - 1080p - 1920 x 1200 - Black - HDMI Converter - VGA to HDMI Monitor Adapter", // $31.00
            "Tripp Lite USB C to HDMI Adapter Converter MF 4K USB Type C to HDMI Black (U444-06N-HDB-AM)", // $18.00
            "Tripp Lite USB C to HDMI Multiport Adapter Converter Hub USB Type C to HDMI (U444-06N-H4GU-C)", // $56.00
            "Vention VGA to HDMI Adapter ,1080P Analog to Digital Video Audio Converter Male to Female with Audio and Micro USB Charging Cable VGA Adapter for PC Laptop to HDTV Projector" // $15.00
    };

    private static double[] cablesPrice = {
            5.00,
            6.00,
            6.00,
            19.00,
            10.00,
            31.00,
            18.00,
            56.00,
            15.00
    };

    private static String[] storageText = {
            "SAMSUNG 860 EVO Series 2.5 500GB SATA III V-NAND 3-bit MLC Internal Solid State Drive (SSD) MZ-76E500BAM", // $57.00
            "SAMSUNG 870 EVO Series 2.5 1TB SATA III Samsung V-NAND Internal Solid State Drive (SSD) MZ-77Q1TOB/AM", // $90.00
            "SAMSUNG 970 EVO M.2 2280 1TB PCIe Gen3. X4, NVMe 1.3 64L V-NAND 3-bit MLC Internal Solid State Drive (SSD) MZ-V7E1T0BW", // $130.00
            "SAMSUNG 970 EVO M.2 2280 500GB PCIe Gen3. X4, NVMe 1.3 V-NAND 3-bit MLC Internal Solid State Drive (SSD) MZ-V7E500BW", // $60.00
            "Seagate BarraCuda ST1000DM010 1TB 7200 RPM 64MB Cache SATA 6.0Gbs 3.5 Hard Drive Bare Drive", // $45.00
            "Seagate Exos 16TB Enterprise HDD X16 SATA 6Gbs 512e4Kn 7200 RPM 256MB Cache 3.5 Internal Hard Drive ST16000NM001G", // $336.00
            "Seagate IronWolf 6TB NAS Hard Drive 7200 RPM 256MB Cache SATA 6.0Gbs CMR 3.5 Internal HDD for RAID Network Attached Storage ST6000VN0033", // $160.00
            "WD Blue WD20EZAZ 2TB 5400 RPM 256MB Cache SATA 6.0Gbs 3.5 Internal Hard Drive" // $50.00
    };

    private static double[] storagePrice = {
            57.00,
            90.00,
            130.00,
            60.00,
            45.00,
            336.00,
            160.00,
            50.00
    };

    private static String[] chairText = {
            "Secretlab OMEGA", // $380.00
            "Secretlab TITAN XL", // $539.00
            "Secretlab TITAN" // $419.00
    };

    private static double[] chairPrice = {
            380.00,
            539.00,
            419.00
    };

    private static String[] projectorText = {
            "ViewSonic PX703HD 1920 x 1080 DLP Projector with 3D Dual HDMI Sports Mode and Low Input Lag for Home Theater and Gaming 3500 Lumens" // $550.00
    };

    private static double[] projectorPrice = {
            550.00
    };

    private static String[] processorText = {
            "Intel Core i5 9600k Unlocked 9th Gen", // $200.00
            "Intel Core i7 9700k Unlocked 9th Gen", // $255.00
            "Intel Core i7 9700 9th Gen", // $255.00
            "Ryzen 5 3600xt", // $600.00
            "Ryzen 7 3700x", // $330.00
            "Ryzen 7 3800x", // $340.00
            "Ryzen 9 3950x" // $710.00
    };

    private static double[] processorPrice = {
            200.00,
            255.00,
            255.00,
            600.00,
            330.00,
            340.00,
            710.00
    };

    // Used for getAllImages, getAllText, getImage, getText

    // There are 18 categories for images
    private static int[][] categoryImages = {
            motherboardImages,
            graphicsCardImages,
            monitorImages,
            routerImages,
            keyboardImages,
            printerImages,
            powerSupplyImages,
            tableImages,
            mouseImages,
            headsetImages,
            ramImages,
            pcCaseImage,
            externalStorageImages,
            cableImages,
            storageImages,
            chairImages,
            projectorImages,
            processorImages
    };

    // There are 18 categories for text
    private static String[][] categoryText = {
            motherboardText,
            graphicsCardText,
            monitorText,
            routerText,
            keyboardText,
            printerText,
            powerSupplyText,
            tableText,
            mouseText,
            headsetText,
            ramText,
            pcCaseText,
            externalStorageText,
            cablesText,
            storageText,
            chairText,
            projectorText,
            processorText
    };

    private static double[][] categoryPrice = {
            motherboardPrice,
            graphicsCardPrice,
            monitorPrice,
            routerPrice,
            keyboardPrice,
            printerPrice,
            powerSupplyPrice,
            tablePrice,
            mousePrice,
            headsetPrice,
            ramPrice,
            pcCasePrice,
            externalStoragePrice,
            cablesPrice,
            storagePrice,
            chairPrice,
            projectorPrice,
            processorPrice
    };

    // Method for filling the Database table1

    public static ArrayList<MyProduct> getAllProducts() {
        ArrayList<MyProduct> rtn = new ArrayList<>();
        for (int j = 0; j < categoryImages.length; j++) {
            for (int s = 0; s < categoryImages[j].length; s++) {
                rtn.add(new MyProduct(categoryImages[j][s], categoryText[j][s],categories[j], categoryPrice[j][s]));
            }
        }
        return rtn;
    }

    public static MyProduct getProduct(Context context, int id) {
        ArrayList<MyProduct> temp;
        ProductDatabase db = new ProductDatabase(context);
        temp = db.getDBArrayList();
        for(int j = 0; j < temp.size(); j++) {
            if(id == temp.get(j).getId()) {
                return temp.get(j);
            }
        }
        return null;
    }

    public static ArrayList<MyProduct> getProducts(String category, Context context) {
        ArrayList<MyProduct> rtn = new ArrayList<>();
        ProductDatabase db = new ProductDatabase(context);
        ArrayList<MyProduct> tempList = db.getDBArrayList();
        ArrayList<MyProduct> categorizedList = db.getDBArrayList();

        if(category.equals("All")) {
            rtn = tempList;
        }
        else {
            for(int j = 0; j < tempList.size(); j++) {
                if(tempList.get(j).getCategory().equals(category)) {
                    rtn.add(new MyProduct(
                            tempList.get(j).getId(),
                            tempList.get(j).getImage(),
                            tempList.get(j).getName(),
                            tempList.get(j).getCategory(),
                            tempList.get(j).getPrice(),
                            tempList.get(j).getStock()
                            ));
                }
            }
        }
        Collections.shuffle(rtn);
        return rtn;
    }

    public static ArrayList<MyProduct> getLowToHigh(String category, Context context) {
        ArrayList<MyProduct> rtn;
        rtn = MyData.getProducts(category, context);
        Collections.sort(rtn, new Comparator<MyProduct>() {
            @Override
            public int compare(MyProduct o1, MyProduct o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
        return rtn;
    }

    public static ArrayList<MyProduct> getHighToLow(String category, Context context) {
        ArrayList<MyProduct> rtn;
        rtn = MyData.getProducts(category, context);
        Collections.sort(rtn, new Comparator<MyProduct>() {
            @Override
            public int compare(MyProduct o1, MyProduct o2) {
                return Double.compare(o2.getPrice(), o1.getPrice());
            }
        });
        return rtn;
    }

}
