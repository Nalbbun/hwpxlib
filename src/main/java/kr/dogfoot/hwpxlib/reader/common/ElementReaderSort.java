package kr.dogfoot.hwpxlib.reader.common;

public enum ElementReaderSort {
    NoAttributeNoChild(ElementReaderType.Basic),

    Switch(ElementReaderType.Basic),
    Case(ElementReaderType.Basic),
    Default(ElementReaderType.Basic),

    HasOnlyText(ElementReaderType.Basic),
    LeftRightTopBottom(ElementReaderType.Basic),
    ParameterList(ElementReaderType.Basic),
    IntegerParam(ElementReaderType.Basic),
    StringParam(ElementReaderType.Basic),
    BooleanParam(ElementReaderType.Basic),
    FloatParam(ElementReaderType.Basic),
    ListParam(ElementReaderType.Basic),

    // Version.xml
    Version(ElementReaderType.Basic),

    // META-INF/manifest.xml
    Manifest(ElementReaderType.Basic),
    FileEntry(ElementReaderType.Basic),
    EncryptionData(ElementReaderType.Basic),
    Algorithm(ElementReaderType.Basic),
    KeyDerivation(ElementReaderType.Basic),
    StartKeyGeneration(ElementReaderType.Basic),

    // META-INF/container.xml
    Container(ElementReaderType.Basic),
    RootFiles(ElementReaderType.Basic),
    RootFile(ElementReaderType.Basic),

    // Contents/content.hpf
    Package(ElementReaderType.Basic),
    Metadata(ElementReaderType.Basic),
    Meta(ElementReaderType.Basic),
    PackageManifest(ElementReaderType.Basic),
    ManifestItem(ElementReaderType.Basic),
    Spine(ElementReaderType.Basic),
    SpineItemRef(ElementReaderType.Basic),

    // Settings.xml
    Settings(ElementReaderType.Basic),
    CaretPosition(ElementReaderType.Basic),
    ConfigItemSet(ElementReaderType.Basic),
    ConfigItem(ElementReaderType.Basic),

    // Contents/header_forTestSwitch.xml
    Head(ElementReaderType.Header),
    BeginNum(ElementReaderType.Header),
    RefList(ElementReaderType.Header),
    Fontfaces(ElementReaderType.Header),
    Fontface(ElementReaderType.Header),
    Font(ElementReaderType.Header),
    SubstFont(ElementReaderType.Header),
    TypeInfo(ElementReaderType.Header),
    BorderFills(ElementReaderType.Header),
    BorderFill(ElementReaderType.Header),
    Slash(ElementReaderType.Header),
    Border(ElementReaderType.Header),
    FillBrush(ElementReaderType.Header),
    WinBrush(ElementReaderType.Header),
    Gradation(ElementReaderType.Header),
    Color(ElementReaderType.Header),
    ImageBrush(ElementReaderType.Header),
    Image(ElementReaderType.Header),
    CharProperties(ElementReaderType.Header),
    CharPr(ElementReaderType.Header),
    StringValuesByLanguageReader(ElementReaderType.Header),
    ShortValuesByLanguageReader(ElementReaderType.Header),
    Underline(ElementReaderType.Header),
    Strikeout(ElementReaderType.Header),
    Outline(ElementReaderType.Header),
    CharShadow(ElementReaderType.Header),
    TabProperties(ElementReaderType.Header),
    TabPr(ElementReaderType.Header),
    TabItem(ElementReaderType.Header),
    Numberings(ElementReaderType.Header),
    Numbering(ElementReaderType.Header),
    ParaHead(ElementReaderType.Header),
    Bullets(ElementReaderType.Header),
    Bullet(ElementReaderType.Header),
    ParaProperties(ElementReaderType.Header),
    ParaPr(ElementReaderType.Header),
    Align(ElementReaderType.Header),
    Heading(ElementReaderType.Header),
    BreakSetting(ElementReaderType.Header),
    ParaMargin(ElementReaderType.Header),
    ValueAndUnit(ElementReaderType.Header),
    LineSpacing(ElementReaderType.Header),
    ParaBorder(ElementReaderType.Header),
    AutoSpacing(ElementReaderType.Header),
    Styles(ElementReaderType.Header),
    Style(ElementReaderType.Header),
    MemoProperties(ElementReaderType.Header),
    MemoPr(ElementReaderType.Header),
    TrackChanges(ElementReaderType.Header),
    TrackChange(ElementReaderType.Header),
    TrackChangeAuthors(ElementReaderType.Header),
    TrackChangeAuthor(ElementReaderType.Header),
    ForbiddenWordList(ElementReaderType.Header),
    CompatibleDocument(ElementReaderType.Header),
    LayoutCompatibility(ElementReaderType.Header),
    LayoutCompatibilityItem(ElementReaderType.Header),
    DocOption(ElementReaderType.Header),
    LinkInfo(ElementReaderType.Header),
    TrackChangeConfig(ElementReaderType.Header),

    // Contents/section0.xml
    Sec(ElementReaderType.Section_MasterPage),
    SubList(ElementReaderType.Section_MasterPage),
    Para(ElementReaderType.Section_MasterPage),
    Run(ElementReaderType.Section_MasterPage),
    SecPr(ElementReaderType.Section_MasterPage),
    Grid(ElementReaderType.Section_MasterPage),
    StartNum(ElementReaderType.Section_MasterPage),
    Visibility(ElementReaderType.Section_MasterPage),
    LineNumberShape(ElementReaderType.Section_MasterPage),
    PagePr(ElementReaderType.Section_MasterPage),
    PageMargin(ElementReaderType.Section_MasterPage),
    FootNotePr(ElementReaderType.Section_MasterPage),
    AutoNumFormat(ElementReaderType.Section_MasterPage),
    NoteLine(ElementReaderType.Section_MasterPage),
    NoteSpacing(ElementReaderType.Section_MasterPage),
    FootNoteNumbering(ElementReaderType.Section_MasterPage),
    FootNotePlacement(ElementReaderType.Section_MasterPage),
    EndNotePr(ElementReaderType.Section_MasterPage),
    EndNoteNumbering(ElementReaderType.Section_MasterPage),
    EndNotePlacement(ElementReaderType.Section_MasterPage),
    PageBorderFill(ElementReaderType.Section_MasterPage),
    Presentation(ElementReaderType.Section_MasterPage),
    Ctrl(ElementReaderType.Section_MasterPage),
    ColPr(ElementReaderType.Section_MasterPage),
    ColSz(ElementReaderType.Section_MasterPage),
    ColLine(ElementReaderType.Section_MasterPage),
    FieldBegin(ElementReaderType.Section_MasterPage),
    FieldEnd(ElementReaderType.Section_MasterPage),
    Bookmark(ElementReaderType.Section_MasterPage),
    HeaderFooter(ElementReaderType.Section_MasterPage),
    FootNoteEndNote(ElementReaderType.Section_MasterPage),
    AutoNumNewNum(ElementReaderType.Section_MasterPage),
    PageNumCtrl(ElementReaderType.Section_MasterPage),
    PageHiding(ElementReaderType.Section_MasterPage),
    PageNum(ElementReaderType.Section_MasterPage),
    Indexmark(ElementReaderType.Section_MasterPage),
    HiddenComment(ElementReaderType.Section_MasterPage),
    T(ElementReaderType.Section_MasterPage),
    MarkpenBegin(ElementReaderType.Section_MasterPage),
    TitleMark(ElementReaderType.Section_MasterPage),
    Tab(ElementReaderType.Section_MasterPage),
    TrackChangeTag(ElementReaderType.Section_MasterPage),
    Tbl(ElementReaderType.Section_MasterPage),



    Pic(ElementReaderType.Section_MasterPage),
    ContainerControl(ElementReaderType.Section_MasterPage),
    OLE(ElementReaderType.Section_MasterPage),
    Equation(ElementReaderType.Section_MasterPage),
    Line(ElementReaderType.Section_MasterPage),
    Rect(ElementReaderType.Section_MasterPage),
    Ellipse(ElementReaderType.Section_MasterPage),
    Arc(ElementReaderType.Section_MasterPage),
    Polygon(ElementReaderType.Section_MasterPage),
    Curve(ElementReaderType.Section_MasterPage),
    ConnectLine(ElementReaderType.Section_MasterPage),
    TextArt(ElementReaderType.Section_MasterPage),
    Compose(ElementReaderType.Section_MasterPage),
    Dutmal(ElementReaderType.Section_MasterPage),
    Btn(ElementReaderType.Section_MasterPage),
    RadioBtn(ElementReaderType.Section_MasterPage),
    CheckBtn(ElementReaderType.Section_MasterPage),
    ComboBox(ElementReaderType.Section_MasterPage),
    Edit(ElementReaderType.Section_MasterPage),
    ListBox(ElementReaderType.Section_MasterPage),
    ScrollBar(ElementReaderType.Section_MasterPage),
    Video(ElementReaderType.Section_MasterPage),

    LineSegArray(ElementReaderType.Section_MasterPage),
    LineSeg(ElementReaderType.Section_MasterPage),
    MasterPage(ElementReaderType.Section_MasterPage),


    End_Of_Entry(null);

    private ElementReaderType type;

    ElementReaderSort(ElementReaderType type) {
        this.type = type;
    }

    public ElementReaderType type() {
        return type;
    }
}
