package ru.stqa.pft.addressbook.model;

public class GroupData {
  private int id; // лекция 4.7 - добавляем атрибут // 4.8  меняем тип идентификатора со String на int
  private final String name;
  private final String header;
  private final String footer;

  public GroupData(String name, String header, String footer) {
    this.id = Integer.MAX_VALUE;  // 4.10  в качестве дефолт значен для ID присваивать самое больщое целое число, и тогда эта группа окажется самой последней
    this.name = name;
    this.header = header;
    this.footer = footer;
  }

  public GroupData(int id, String name, String header, String footer)  // лекция 4.7 - добавляем параметр в конструктор, куда будет передаваться это индитификатор
  {
    this.id = id; // лекция 4.7 - присваиваем значение параметра в атрибут
    this.name = name;
    this.header = header;
    this.footer = footer;
  }

    public int getId() { return id; }  // 4.8  меняем тип идентификатора со String на int

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public String getHeader() {
    return header;
  }

  public String getFooter() {
    return footer;
  }

  @Override
  public String toString() {
    return "GroupData{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    GroupData groupData = (GroupData) o;

    return name != null ? name.equals( groupData.name ) : groupData.name == null;
  }

  @Override
  public int hashCode() {
    return name != null ? name.hashCode() : 0;
  }
}

