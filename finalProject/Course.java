public enum Course {
	COMPUTER_SCIENCE(Module.CS101, Module.CS102, Module.CS103),
    ENGINEERING(Module.ENG101, Module.ENG102, Module.ENG103),
    BIOLOGY(Module.BIO101, Module.BIO102, Module.BIO103),
    CHEMISTRY(Module.CHEM101, Module.CHEM102, Module.CHEM103),
    PHYSICS(Module.PHYS101, Module.PHYS102, Module.PHYS103),
    MATHEMATICS(Module.MATH101, Module.MATH102, Module.MATH103),
    PSYCHOLOGY(Module.PSYCH101, Module.PSYCH102, Module.PSYCH103),
    ECONOMICS(Module.ECON101, Module.ECON102, Module.ECON103),
    LITERATURE(Module.LIT101, Module.LIT102, Module.LIT103),
    HISTORY(Module.HIST101, Module.HIST102, Module.HIST103),
    POLITICAL_SCIENCE(Module.POL101, Module.POL102, Module.POL103),
    BUSINESS_ADMINISTRATION(Module.BUS101, Module.BUS102, Module.BUS103),
    MARKETING(Module.MKTG101, Module.MKTG102, Module.MKTG103),
    NURSING(Module.NURS101, Module.NURS102, Module.NURS103),
    JOURNALISM(Module.JOURN101, Module.JOURN102, Module.JOURN103),
    ARCHITECTURE(Module.ARCH101, Module.ARCH102, Module.ARCH103),
    ART_HISTORY(Module.ART101, Module.ART102, Module.ART103),
    COMMUNICATIONS(Module.COMM101, Module.COMM102, Module.COMM103),
    PHILOSOPHY(Module.PHIL101, Module.PHIL102, Module.PHIL103),
    SOCIOLOGY(Module.SOC101, Module.SOC102, Module.SOC103),
    MEDICINE(Module.MED101, Module.MED102, Module.MED103),
    ENGLISH_LITERATURE(Module.ENGLIT101, Module.ENGLIT102, Module.ENGLIT103),
    GEOGRAPHY(Module.GEO101, Module.GEO102, Module.GEO103),
    ARCHAEOLOGY(Module.ARCHAEO101, Module.ARCHAEO102, Module.ARCHAEO103),
    MODERN_LANGUAGES(Module.MODLANG101, Module.MODLANG102, Module.MODLANG103),
    MUSIC(Module.MUSIC101, Module.MUSIC102, Module.MUSIC103),
    LAW(Module.LAW101, Module.LAW102, Module.LAW103);
	
	private final Module[] modules;

    Course(Module... modules) {
        this.modules = modules;
    }

    public Module[] getModules() {
        return modules;
    }
}


