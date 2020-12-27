package com.example.netrunners;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class MyData {

    public static String FormatNumber(Double number) {
        String formattedNumber;
        formattedNumber = String.format(Locale.ENGLISH, "%,.2f", number);
        return formattedNumber;
    }

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

    private static String[] motherboardDescription = {
            "ROG Strix B550 Gaming series motherboards offer a feature-set usually found in the higher-end ROG Strix X570 Gaming series, " +
                    "including the latest PCIe® 4.0. With robust power delivery and effective cooling, ROG Strix B550 Gaming is well-equipped to " +
                    "handle 3rd Gen AMD Ryzen™ CPUs. Boasting futuristic aesthetics and intuitive ROG software, " +
                    "ROG Strix B550-E Gaming gives you a head start on your dream build.\n",

            "ASRock B550M Steel Legend represents the philosophical state of rock-solid durability and irresistible aesthetics. " +
                    "Built around most demanding specs and features, the Steel Legend series aims at daily users and mainstream enthusiasts! " +
                    "Providing a strong array of materials/components to ensure a stable and reliable performance.\n",

            "TUF Gaming X570-Plus (Wi-Fi) distills the essential elements of the latest AMD platform and combines them with game-ready features and proven durability. " +
                    "Engineered with military-grade components, upgraded power solutions and a comprehensive set of cooling options, " +
                    "these motherboards deliver rock-solid performance with unwavering gaming stability.\n",

            "ASUS Prime series is expertly engineered to unleash the full potential of 10th Gen Intel® Core™ processors. " +
                    "Boasting a robust power design, comprehensive cooling solutions and intelligent tuning options, " +
                    "Prime Z490 series motherboards provide daily users and DIY PC builders a range of performance tuning options via " +
                    "intuitive software and firmware features.\n",

            "The ROG Strix Z490-E Gaming motherboard is designed to cope with the demands of 10th Generation Intel® Core™ processors, " +
                    "with boosted power delivery and an optimized cooling design providing more surface area for heat dissipation. " +
                    "ROG Strix Z490-E Gaming features AI enhancements and intuitive dashboards to help you overclock and tweak various parameters easily. " +
                    "Performance aside, ROG Strix Z490-E Gaming catches the eye, sporting cyberpunk inspired aesthetics including a " +
                    "mirrored stainless steel finish.\n"
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

    private static String[] graphicsCardDescription = {
            "ASUS GeForceRTX™ graphics cards are powered by the Turing GPU architecture and the all-new RTX platform. " +
                    "This gives you up to 6X the performance of previous-generation graphics cards and brings the power of " +
                    "real-time ray tracing and AI to games.\n",

            "ROG Strix GeForce® RTX 2060 SUPER™ OC edition 8GB GDDR6 with powerful cooling for higher refresh rates and a super performance boost\n",

            "The 7th generation of the famous MSI TWIN FROZR Thermal Design brings the most advanced technology for ultimate cooling performance. " +
                    "It features the new TORX FAN 3.0 combined with groundbreaking aerodynamic feats. " +
                    "This means stable performance and a silent experience are guaranteed thanks to low temperatures.\n",

            "The much anticipated return of MSI’s iconic dual fan GAMING series. " +
                    "Combining a mix of black and gunmetal grey with a classy brushed metal backplate, " +
                    "this masterpiece provides you premium design with magnificent and smooth RGB light effects on the outside. " +
                    "The new MSI GAMING card is designed to amaze you!\n",

            "The GeForce RTX™ 3070 is powered by Ampere—NVIDIA’s 2nd gen RTX architecture. " +
                    "Built with enhanced Ray Tracing Cores and Tensor Cores, new streaming multiprocessors, " +
                    "and high-speed G6 memory, it gives you the power you need to rip through the most demanding games.",

            "The GeForce RTX™ 3080 delivers the ultra performance that gamers crave, powered by Ampere—NVIDIA’s 2nd gen RTX architecture. " +
                    "It’s built with enhanced RT Cores and Tensor Cores, new streaming multiprocessors, " +
                    "and superfast G6X memory for an amazing gaming experience.\n",

            "The GeForce RTX™ 3090 is a big ferocious GPU (BFGPU) with TITAN class performance. " +
                    "It’s powered by Ampere—NVIDIA’s 2nd gen RTX architecture—doubling down on ray tracing " +
                    "and AI performance with enhanced Ray Tracing (RT) Cores, Tensor Cores, and new streaming multiprocessors. " +
                    "Plus, it features a staggering 24 GB of G6X memory, all to deliver the ultimate gaming experience.\n"


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

    private static String[] monitorDescription = {
            "ProArt Display PA248QV is a 24.1-inch monitor designed to satisfy the needs of creative professionals, from photo and video editing to graphic design. " +
                    "ProArt Display PA248QV is factory calibrated and Calman Verified to deliver superb color accuracy (∆E < 2). " +
                    "It also provides industry-standard 100% sRGB / 100% Rec. 709 color space coverage. With ASUS-exclusive features, " +
                    "such as ProArt Preset and ProArt Palette with six-axis color, black-level and brightness adjustments, " +
                    "PA248QV makes it easy to achieve the exact look you desire quickly, easily and precisely.\n",

            "TUF Gaming VG328H1B is a 31.5-inch, Full HD (1920x1080), curved display with an ultrafast 165Hz refresh rate designed for professional gamers and those seeking immersive gameplay. " +
                    "Those are some serious specs, but not even the most exciting thing the VG328H1B has in store. " +
                    "Its impressive curved display features a 165Hz refresh rate and Adaptive-Sync (FreeSync™ Premium) technology, " +
                    "for extremely fluid gameplay without tearing and stuttering.\n",

            "Visualize your victory with MSI Optix MAG270VC2 Curved Gaming monitor. Equipped with a 1920x1080, 165hz Refresh rate, 1ms response time panel, " +
                    "Optix MAG270VC2 will give you the competitive edge you need to take down your opponents. " +
                    "Built with adaptive sync, Optix MAG270VC2 can match the display's refresh rate with your GPU for ultra-smooth gameplay. " +
                    "Make sure you can hit your mark with all the latest technologies built-in the MSI Curved Gaming monitor for competitive play.\n",

            "Samsung C32JG56 curved gaming monitor is crafted for victory. Blazing-fast 144Hz refresh rate and AMD FreeSync make gameplay exceptionally smooth " +
                    "without image tearing and screen lag. The 32\" VA panel with 1800R curvature puts you into the center of action while a high contrast ratio of 3000:1 " +
                    "enables you to see enemies in the dark. An array of gaming-oriented features, like Game Mode and OSD dashboard, ensure you make the most out of any gaming session.\n"
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

    private static String[] routerDescription = {
            "AC2900 WiFi Gaming Router, certified by NVIDIA for the GeForce NOW Recommended program. " +
                    "Supports triple-level game acceleration, easy port forwarding, AiMesh for whole-home wifi and AiProtection Pro for network security.\n",

            "ADVANCED CYBER-SECURITY: Supports WPA2/WPA3 wireless security protocols. " +
                    "Includes Guest WiFi access, VPN, and NETGEAR Armor (powered by BitDefender )- a best-in-class anti-virus, anti-malware, and data protection technology.\n",

            "NETGEAR Smart WiFi Router AC1750 (R6400) has Dual band, which reduces interference for better connections to more WiFi devices.\n"
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

    private static String[] keyboardDescription = {
            "Battlefield domination beckons with the light-speed actuation of TUF Gaming K7's Optical-Mech switches. " +
                    "Choose linear or tactile to match your play style, and exploit the compact design to stay in command. " +
                    "K7 is water and dust resistant, topped with aircraft-grade aluminum, comes with a detachable wrist rest, " +
                    "and has per-key Aura Sync illumination – for a fast and fun way to light up your gaming world.\n",

            "Powerful CORSAIR iCUE software enables vivid dynamic RGB lighting control, " +
                    "sophisticated macro programming and full-system lighting synchronization across all iCUE-compatible CORSAIR devices\n",

            "The CORSAIR K55 RGB Gaming Keyboard features dynamic three-zone RGB backlighting, " +
                    "six dedicated macro keys with Elgato Stream Deck software integration, IP42 dust and spill resistance, and a detachable palm rest.\n",

            "The G213 gaming keyboard features Logitech G Mech-Dome keys that are specially tuned to deliver " +
                    "a superior tactile response and overall performance profile similar to a mechanical keyboard." +
                    "Mech-Dome keys are full height, deliver a full 4mm travel distance, 50g actuation force, and a quiet sound operation.\n",

            "Logitech G610 Orion Red is a full-size mechanical keyboard equipped with Cherry MX Red switches. " +
                    "G610 Orion is also available in Cherry MX Brown and Blue switches. " +
                    "Choose the one that suits you best. " +
                    "ated to over 50 million keystrokes, it can last for future upgrades. 26 key rollover, 12 macro keys (F1 through F12), " +
                    "per key lighting and media controls offer the customization and control critical for victory. It is ready to game.\n",

            "G915 features pro-grade LIGHTSPEED wireless that achieves super-fast 1 ms performance. " +
                    "It’s the same wireless technology that esports pros all over the world trust in competitions. " +
                    "G915 is also fully functional when plugged in via USB, so you can charge and play simultaneously.\n",

            "The Razer BlackWidow X Ultimate features a whole new look, one that’s been stripped down to reveal a sleek and compact piece of engineering ingenuity. " +
                    "Constructed from military grade metal, the polished body of the Razer BlackWidow X Ultimate is both rugged and durable, " +
                    "ensuring you’ll enjoy stellar performance even during the most intense gaming sessions.\n",

            "Designed from the ground up, the all-new Razer Mecha-Membrane combines the soft cushioned touch of a membrane rubber dome with the crisp tactile click of a mechanical switch\n"
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

    private static String[] printerDescription = {
            "The Brother Work Smart Series MFC-J491DW is easy to connect, compact, affordable and " +
                    "loaded with features and functionality to help boost productivity in your home, home office, dorm room or small office. " +
                    "This wireless color inkjet all-in-one delivers high-quality output, lets you reliably print, copy, " +
                    "scan and fax and enables wireless mobile device printing from your desktop, laptop, smartphone or tablet‡. " +
                    "Use the automatic document feeder and 100-sheet capacity paper tray for generous output without " +
                    "constant monitoring and help save paper with automatic duplex (2-sided) printing. " +
                    "Cloud connectivity lets you scan-to popular Cloud services directly from the printer‡. " +
                    "Comes with a one-year limited warranty and free online, call, or live chat support for the life of the printer.\n",

            "Canon PIXMA TR4520 Wireless Office All-In-One Printer - BLACK New space saving design is approx. " +
                    "30% smaller than previous MX models. Enjoy new levels of printing convenience utilizing features such as " +
                    "AirPrint and Google Cloud Print to easily print from your tablet or Smartphone. " +
                    "The fully integrated Auto Document Feeder is elegantly designed to be both functional and practical. " +
                    "Auto Document Feeder (ADF), AE (Auto Exposure) Copy, Borderless Copy, Collated Copy, 2-on-1 Copy, 4-on-1 Copy, " +
                    "Fit-to-Page, Preset Copy Ratios, Frame Erase Copy (Flatbed), Zoom. Auto Scan Mode, Network Scan, PDF Password Security, Push Scan, Send to Cloud. " +
                    "Answering Machine Connectivity, Caller Rejection, Check RX Fax Info., Dial Search, Extra Fine Mode, Fax Reception Reject, " +
                    "Fax Number Re-Entry, Memory Transmission, Redial, Remote Reception. Compatible Inks - PG-245 Black Ink Cartridge, CL-246 Color Ink Cartridge " +
                    "including XL and PG-245XL /246XL Combo Value Pack.\n",

            "The HP® Photo 7155 inkjet printer creates photo-quality images right in your own home or office. Wireless connectivity makes both setting up and printing easy. " +
                    "Get lab-quality photos without having to visit the local drugstore or print shop.\n",

            "Organize documents 50% faster – Eliminate steps in repetitive tasks and sync to QuickBooks, " +
                    "Google Drive, and more using Smart Tasks—the easiest way to digitize and organize receipts and business documents on your phone\n"
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

    private static String[] powerSupplyDescription = {
            "CORSAIR CV power supplies are ideal for powering your new home or office PC, with 80 PLUS Bronze efficiency guaranteed to continuously deliver full wattage to your system.",

            "CX Series™ Modular power supply units are an excellent choice for basic system builds and desktop PC computer upgrades, " +
                    "offering high reliability, low noise, and the flexibility of modular cabling.",

            "Start your new PC off with a CORSAIR VS power supply, featuring 80 PLUS certified efficiency, a low-noise 120mm cooling fan, and a comprehensive three-year warranty.",

            "80 plus Bronze Certified, with 85% efficiency or higher under typical loads\n",

            "80 plus white certified, with 80 percentage efficiency or higher under typical loads\n",

            "80 plus Gold certified, with 91% efficiency or higher under typical loads\n"
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

    private static String[] tableDescription = {
            "Perfect for your gaming setup, our new Clutch Gaming Desks are now available. Our Black/White Gaming Desks will brighten up your gaming setup or office.\n",

            "Perfect for your gaming setup, our new Clutch Gaming Desks are now available. Our White L-Shaped Gaming Desks will brighten up your gaming setup or office.\n",

            "Perfect for your gaming setup, our new Clutch Gaming Desks are now available. Our White U-Shaped Gaming Desks will brighten up your gaming setup or office.\n"
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

    private static String[] mouseDescription = {
            "The CORSAIR DARK CORE RGB PRO helps you win without wires, boasting sub-1ms SLIPSTREAM WIRELESS, " +
                    "a custom 18,000 DPI optical sensor optimized for wireless mice, and hyper-polling technology up to 2,000Hz.\n",

            "Logitech G102 (G203) PRODIGY 6000DPI 1000Hz Polling Rate 16.8M Color RGB Gaming Mouse - Black FEATURES PLAY LIKE THE PROS Trusted by top Esports Professionals. " +
                    "The difference between winning and losing in today’s games isn’t measured in meters or seconds, but micrometers and milliseconds. " +
                    "When the stakes are at their highest, a single click can be the difference between going home with $5k or with $500k. " +
                    "That’s why Logitech G created the Pro Gaming Mouse. Its lightweight body and optical gaming sensor are engineered " +
                    "for the unprecedented speed and precision aiming needed at the highest level of esport competition.\n",

            "“The Logitech G502 LIGHTSPEED wireless gaming mouse doesn’t just expertly ditch the wire, it also improves the already stellar sensor, " +
                    "and supports this high performance mouse with a remarkably capable software package. Looks like the G502 is back in a big way.”\n",

            "High-Precision 6400 DPI Optical Sensor: Offers on-the-fly sensitivity adjustment through dedicated DPI buttons (reprogrammable) for gaming\n",

            "The Razer DeathAdder V2 continues this legacy, retaining its signature shape while shedding more weight for quicker handling to improve your gameplay. " +
                    "Going beyond conventional office ergonomics, the optimized design also provides greater comfort for " +
                    "gaming—important for those long raids or when you’re grinding your rank on ladder.\n"
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

    private static String[] headsetDescription = {
            "The CORSAIR HS60 PRO SURROUND Gaming Headset delivers both comfort and quality with memory foam ear pads, " +
                    "custom-tuned 50mm neodymium audio drivers, and a detachable noise-cancelling unidirectional microphone.\n",

            "HyperX Cloud Stinger™ is perfect for streamers and gamers looking for an affordable, high-quality headset. " +
                    "At a mere 275 grams, it’s easy on your neck and its ear cups rotate in a 90-degree angle for an adaptive fit. " +
                    "50mm directional drivers pipe high-quality sound directly into the ear for pinpoint audio precision. " +
                    "Cloud Stinger’s ear cups are made from signature HyperX memory foam for legendary comfort during marathon gaming sessions — even when worn over glasses!\n",

            "With the Logitech G432 gaming headset, your favorite games will finally sound the way they’re supposed to: Amazing. " +
                    "Huge 50mm drivers and DTS Headphone:X 2.0 surround sound create an incredible, fully-immersive soundscape.\n",

            "Logitech G733 is wireless and designed for comfort. And it’s outfitted with all the surround sound, voice filters, " +
                    "and advanced lighting you need to look, sound, and play with more style than ever.\n",

            "What if we told you it’s possible to experience complete gaming immersion without feeling like you’ve got a headset on? Enter the Razer Kraken X. " +
                    "Ultra-light at just 250g and ultra-immersive with 7.1 surround sound. Sit tight and play for hours—your gaming marathons are about to be a breeze.\n"
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

    private static String[] ramDescription = {
            "Speeds up to 3200 MT/s and faster data rates are expected to be available as DDR4 technology matures\n",

            "Speeds up to 3200 MT/s and faster data rates are expected to be available as DDR4 technology matures & Increase bandwidth by up to 30%\n",

            "XMP 2.0 support for automatic overclocking, or run at JEDEC default profile & Modern aluminum heat spreader available in multiple colors to match your system build or style\n",

            "Features Auto-Overclocking which allows qualified systems to detect the highest available speed and automatically adjust BIOS settings to match\n",

            "Born to outperform, the G.SKILL Ripjaws V series memory modules are great for " +
                    "DIY professionals and power users seeking first-class performance, reliability and overclocking potential from their powerhouses.\n",

            "3200MHz memory speed, PC4-25600, 288 pins per module\n",

            "Get faster speed of gaming, video editing, and rendering with the HyperX FURY DDR4 memory. " +
                    "Compatible with the mainstream Intel and AMD processors, it features a stylish, low profile heat spreader that makes its operation cool and stable. " +
                    "The support for Intel XMP technology lets you easily overclock the memory module without complicated manual tweaking.\n",

            "HyperX® FURY DDR4 provides a powerful performance boost for gaming, video editing, and rendering with speeds up to 3733MHz. " +
                    "This cost-effective upgrade is available in 2400MHz–3733MHz speeds, CL15–19 latencies, single module capacities of 4GB–32GB, " +
                    "and kit capacities of 16GB–128GB. It features Plug N Play1 automatic overclocking at 2400MHz and 2666MHz speeds and is both Intel XMP-ready and Ready for AMD Ryzen. " +
                    "HyperX FURY DDR4 stays cool with its stylish, low-profile heat spreader. 100% tested at speed and backed by a lifetime warranty, it’s an easy, " +
                    "worry-free upgrade for your Intel or AMD-based system.\n",

            "Get memory that’s Ready for Ryzen and will seamlessly integrate with your AMD-based system. A reliable, compatible performance boost for your build.\n",

            "Reaching speeds of up to 4133MHz and sporting a maximum capacity of 32GB, the XPG SPECTRIX D50 is a monster of a memory module. " +
                    "It also has looks to kill with an elegant geometric styling and a stunning triangular RGB light bar.\n"
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

    private static String[] pcCaseDescription = {
            "The clean, modern design, iconic cable management bar, and uninterrupted tempered-glass side panel showcase your stunning build.\n",

            "With a USB 3.1 Gen2-compatible USB-C connector on the front panel, " +
                    "it’s easier than ever to connect smartphones, high-speed external storage, or the latest peripherals to your PC\n",

            "The H510 Elite compact ATX mid-tower is perfect for your RGB build. " +
                    "Behind the flush-mounted, tempered glass front panel, you’ll discover our renowned Aer RGB 2 fans keeping your components brilliantly cool. " +
                    "Well-engineered airflow, removable radiator mounting bracket, multiple fan filters, vertical GPU mount, " +
                    "a front panel USB-C connector, and an all-steel and tempered glass construction are just some of the key features you’ll get. " +
                    "The H510 Elite also includes the NZXT Smart Device 2, powering the built-in RGB light strips and case fans.\n",

            "Enhanced cable management: our patented cable routing kit with pre-installed channels and straps makes wiring Easy and intuitive\n",

            "Four Aer F120mm fans* are included for optimal internal airflow and the front panel and PSU intakes include removable filters. " +
                    "Includes a reversible,removeable, top-mounted bracket designed for radiators up to 360mm simplifies the installation of  " +
                    "either closed-loop or custom-loop water cooling.\n"
    };

    private static String[] externalStorageText = {
            "ORICO External SATA SSD Hard Drive 1TB SSD 128GB 256GB 512GB SATA SSD Portable Solid State Drive with Type C USB 3.1 Gen-2 (10Gbs) High-speed Portable SATA SSD", // $58.00
            "Seagate 2TB Backup Plus Slim Portable External Hard Drive USB 3.0 STHN2000402 Light Blue + 1Yr Mylio Create + 2MO Adobe CC Photography", // $68.00
            "Seagate Portable Hard Drive 4TB HDD - External Expansion for PC Windows PS4 & Xbox - USB 2.0 & 3.0 Black (STEA4000400)", // $97.00
            "WD Black 5TB P10 Game Drive Portable External Hard Drive for PS4Xbox OnePCMac USB 3.2 (WDBA3A0050BBK-WESN)" // $120.00
    };

    private static double[] externalStoragePrice = {
            58.00,
            68.00,
            97.00,
            120.00
    };

    private static String[] externalStorageDescription = {
            "Read-write Speed :540MB/S, \n Capacity:128G / 256G / 512G / 1T (Optional) \n Supported System: Windows 7/8/10, Mac OS , Linux , Android",

            "Refined and understated. Cozy and textured. Backup Plus comes in an array of styles made to compliment your signature look. " +
                    "And whether you’re storing yearly tax documents or ever-growing collections of high-res photos, capacity won’t be an issue.",

            "Easily store and access 4TB of content on the go with Seagate Expansion Portable hard drive\n",

            "The WD_BLACK™ P10 Game Drive gives your console or PC the performance-enhancing tools it needs to keep your competitive edge. " +
                    "Its a top-tier external HDD in capacities up to 5TB, built specifically for gamers looking to expand the potential of their " +
                    "console or PC by saving their game library in an on-the-go form factor. Now, with WD_BLACK™ P10 Game Drive, you can drive your game the way you choose.\n"
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

    private static String[] cablesDescription = {
            "Compatible for your streaming devices, Apple TV 4K, NVIDIA SHIELD TV, CD/DVD/Blu-ray players, " +
                    "Fire TV, Roku Ultra, PS4/3, Xbox One/360, Nintendo Switch, computers, or other HDMI-enabled devices to your 4K/HD TV, " +
                    "monitors, displays or projectors.\n",

            "Screened Shielded Twist Pairing (SSTP) Cable Shielding protects cable from External EMI interferences\n",

            "6-ft USB 2.0 to Micro-USB B cable makes it compatible with most computers\n",

            "This DisplayPort 1.4 cable connects your DisplayPort™ laptop or desktop computer to a " +
                    "“super ultra-high definition” 8K monitor, TV or projector. It supports resolutions up to 8K (7680x4320) @ 60Hz.\n",

            "This 6 ft SVGA/VGA monitor extension cable features a high density D-Sub male (HDD15 male) connector and a D-Sub female (HDD15 female) connector, " +
                    "allowing you to extend a VGA cable connection by 6ft. For best performance, this VGA extension cable is designed to be used with low-resolution applications.\n",

            "The HD2VGAA2 HDMI® to VGA Adapter Cable enables you to connect an HDMI output device, such as a laptop video output or digital media extender to a " +
                    "VGA display device (monitor, projector) by converting the HDMI video signal from the output device into a VGA output and separate 2-channel analog audio. " +
                    "The HDMI to VGA adapter is intended for displaying user generated content such as presentations, documents, and work sheets onto a VGA projector or monitor. " +
                    "The adapter can also extend your computer's desktop to double your workspace and increase productivity.\n",

            "This USB 3.1 to HDMI adapter helps you transmit video from your tablet, laptop, Chromebook, MacBook, smartphone or PC to a 4K HDMI-enabled television, monitor or projector. " +
                    "It’s ideal for giving video presentations in conference rooms and classrooms, editing multiple documents on a " +
                    "larger screen or streaming video for digital signage in crystal-clear 4K.\n",

            "This 4K adapter turns the USB-C or Thunderbolt 3 port on your tablet, laptop, Chromebook, MacBook, smartphone or PC into multiple ports. " +
                    "It’s ideal for transmitting digital audio and 4K video to a large display, adding a thumb drive or other USB peripheral, " +
                    "powering and charging a PD Charging-compliant mobile device, and connecting to a Gigabit Ethernet network—all at the same time.\n",

            "This product is only available for VGA (laptop) to HDMI (monitor/TV/projector) mode transmission.\n"
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


    private static String[] storageDescription = {
            "The newest edition to the world's best-selling* SATA SSD series, the Samsung 860 EVO is specially designed to enhance performance of mainstream PCs and laptops. " +
                    "With the latest V-NAND technology, this fast and reliable SSD comes in a wide range of compatible form factors and capacities.\n",

            "The 870 QVO is Samsung’s latest 2nd generation QLC SSD with up to 4TB of storage capacity. Dependable storage for PCs and laptops, with performance you can trust.\n",

            "Accelerate into next-gen computing. The Samsung 970 EVO delivers breakthrough speeds, best-in-class reliability, and a broad range of capacity options up to 2TB*. " +
                    "The latest V-NAND, new Phoenix controller, and Intelligent TurboWrite technology enhance high-end gaming and 4K & 3D graphic editing.\n",

            "Accelerate into next-gen computing. The Samsung 970 EVO 500GB delivers breakthrough speeds, best-in-class reliability, and a broad range of capacity options up to 2TB*. " +
                    "The latest V-NAND, new Phoenix controller, and Intelligent TurboWrite technology enhance high-end gaming and 4K & 3D graphic editing.\n",

            "For more than 20 years, Seagate has manufactured and delivered the reliable BarraCuda family of drives. " +
                    "Your positive hard drive experience matters to us, which is why we offer robust limited warranties on all BarraCuda drives.\n",

            "For everything hyperscale, there’s Exos X—the most powerful way to access the datasphere and harness the full potential of the cloud. " +
                    "The Exos X12 and X10 enterprise hard drives support scalable, secure, and reliable cloud data centers while meeting stringent TCO requirements.\n",

            "Seagate understands your unique data storage challenges and crafted the IronWolf® and IronWolf Pro 18 TB network attached storage (NAS) hard drives to help you achieve your goals.\n",

            "Compatibility is Windows 10. Windows 8.1, Windows 7, macOS High Sierra, Sierra El Capitan. " +
                    "Compatibility may vary depending on user’s hardware configuration and operating system. Acronis True Image WD Edition designed to work with Windows systems only\n"
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

    private static String[] chairDescription = {
            "Feel comfort for endless hours regardless of what you’re doing with this flagship best-seller. " +
                    "With marked improvements to comfort, support, and reliability, the 2020 update to the multi-award winning Secretlab " +
                    "OMEGA delivers an unparalleled sitting experience that is hailed as the gold standard of gaming chairs.\n",

            "The same award-winning comfort. Now bigger. The TITAN XL retains the same unparalleled level of customization as the TITAN, " +
                    "and all the superb comfort, support, reliability that comes with the new 2020 Series. On top of being 25% larger than the TITAN, " +
                    "the core mechanisms have been doubly reinforced. For an uncompromising experience that lasts for endless hours, " +
                    "this award-winning chair is unquestionably the gold standard you need.\n",

            "The larger cousin of the Secretlab OMEGA. The Secretlab TITAN is renowned for its ample space in addition to customization at the highest level. " +
                    "To give you greater comfort, support, reliability and personalization, the new 2020 Series features multiple improvements " +
                    "that will exceed the expectations of even the most discerning. For an uncompromising experience that lasts for endless hours, " +
                    "this elite award-winning chair is unquestionably the gold standard you need.\n"
    };

    private static String[] projectorText = {
                "ViewSonic PX703HD 1920 x 1080 DLP Projector with 3D Dual HDMI Sports Mode and Low Input Lag for Home Theater and Gaming 3500 Lumens" // $550.00
    };

    private static double[] projectorPrice = {
            550.00
    };

    private static String[] projectorDescription = {
            "CINEMATIC COLORS: Exclusive Color technology offers a wide color gamut for beautiful image production in nearly any environment\n"
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

    private static String[] processorDescription = {
            "Introducing the unlocked 9th Gen Intel® Core™ i5-9600K desktop processor, part of the most powerful family of Intel® Core™ desktop processors ever. " +
                    "Get in the game with this 6 core processor featuring Intel® Turbo Boost Technology 2.0, " +
                    "giving you a maximum processor frequency of 4.6 GHz1 when you need it most.\n",

            "Gaming, recording and streaming simultaneously can place big demands on your PC. An unlocked 9th Gen Intel® Core™ i7-9700K desktop processor, " +
                    "with maximum processor frequency of 4.9 GHz1, 8 cores and 8 threads allows you to multitask without having to sacrifice your gaming experience.\n",

            "Today’s gaming and productivity applications can place significant demands on your PC. A 9th Gen Intel® Core™ i7-9700 processor, with a maximum frequency of 4.7 GHz1, " +
                    "8 cores and 8 threads allows you to multitask and enjoy your entertainment like never before. This is blazing-fast performance designed for " +
                    "demanding applications and gaming.\n",

            "Everyone deserves a powerful processor. Uncompromising features and smooth performance are finally the standard for every gamer and streamer.\n",

            "Experience elite performance in games, content creation, and intense multi-tasking in a beautifully balanced design for serious PC enthusiasts.\n",

            "8 cores and 16 processing threads, bundled with the AMD Wraith Prism cooler with color controlled LED support\n",

            "Blur the line between elite gaming performance and professional content creation with the most advanced desktop processors in the world.\n"
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

    private static String[][] categoryDescription = {
            motherboardDescription,
            graphicsCardDescription,
            monitorDescription,
            routerDescription,
            keyboardDescription,
            printerDescription,
            powerSupplyDescription,
            tableDescription,
            mouseDescription,
            headsetDescription,
            ramDescription,
            pcCaseDescription,
            externalStorageDescription,
            cablesDescription,
            storageDescription,
            chairDescription,
            projectorDescription,
            processorDescription
    };

    // Method for filling the Database table1

    // Used for when the user opens the app, all the data is stored in the products table
    public static ArrayList<MyProduct> getAllProducts() {
        ArrayList<MyProduct> rtn = new ArrayList<>();
        for (int j = 0; j < categoryImages.length; j++) {
            for (int s = 0; s < categoryImages[j].length; s++) {
                rtn.add(new MyProduct(categoryImages[j][s], categoryText[j][s], categories[j], categoryPrice[j][s], categoryDescription[j][s]));
            }
        }
        return rtn;
    }

    // Getting one specific product from the product table
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

    // Used to get all the products to display on the recyclerView
    // Gets data from the table and stores it in ArrayList of Object my product
    public static ArrayList<MyProduct> getProducts(String category, Context context) {
        ArrayList<MyProduct> rtn = new ArrayList<>();
        ProductDatabase db = new ProductDatabase(context);
        ArrayList<MyProduct> tempList = db.getDBArrayList();
        ArrayList<MyProduct> categorizedList = db.getDBArrayList();
        // If all products is requested
        if(category.equals("All")) {
            rtn = tempList;
        }
        // If certain category of products is requested
        else {
            for(int j = 0; j < tempList.size(); j++) {
                if(tempList.get(j).getCategory().equals(category)) {
                    rtn.add(new MyProduct(
                            tempList.get(j).getId(),
                            tempList.get(j).getImage(),
                            tempList.get(j).getName(),
                            tempList.get(j).getCategory(),
                            tempList.get(j).getPrice(),
                            tempList.get(j).getStock(),
                            tempList.get(j).getDescription()
                            ));
                }
            }
        }
        Collections.shuffle(rtn);
        return rtn;
    }

    // Uses the (getProducts) and arranges the product price from low to high
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

    // Uses the (getProducts) and arranges the product price from high to low
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

    // Cart

    // Get specific product from cart table
    public static MyProduct getCartProduct(Context context, int cart_id) {
        ArrayList<MyProduct> temp;
        ProductDatabase db = new ProductDatabase(context);
        temp = db.getCartArrayList();
        for(int j = 0; j < temp.size(); j++) {
            if(cart_id == temp.get(j).getId()) {
                return temp.get(j);
            }
        }
        return null;
    }

    // Checks if the added product is already in the cart
    public static boolean isProductOnCart(Context context, int id) {
        ProductDatabase db = new ProductDatabase(context);
        ArrayList<MyProduct> temp = db.getCartArrayList();
        for(int j = 0; j < temp.size(); j++) {
            System.out.println(id + " " + temp.get(j).getId());
            if(id == temp.get(j).getId()) {
                db.updateCart(String.valueOf(temp.get(j).getId()),
                        String.valueOf(temp.get(j).getQuantity()+1));
                return true;
            }
        }
        return false;
    }

    // Get all product from cart table
    public static ArrayList<MyProduct> getAllCartProduct(Context context) {
        ProductDatabase db = new ProductDatabase(context);
        return db.getCartArrayList();
    }

}