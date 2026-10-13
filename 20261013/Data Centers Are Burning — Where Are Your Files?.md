# Data Centers Are Burning — Where Are Your Files?

## — The Trust Crisis in Personal Storage Seen Through the Russia-Ukraine "Data Center War"

### An Unprecedented Form of Warfare

Over the past week, a new target has emerged amid the Russia-Ukraine conflict: data centers.

On October 8, a data center belonging to Yandex, Russia’s largest search engine, caught fire after a drone strike in Ryazan Oblast. Multiple modules were completely disabled, and it remains unclear whether they can be restored. On October 9, a second data center in Kaluga Oblast came under attack, with some infrastructure damaged. On October 11, another data center in Odesa was also hit by a Russian drone.

Three data centers were struck in three successive days.

Yandex was forced to announce that parts of its data centers will not be restorable until 2028 at the earliest. Many of the company’s services across Russia suffer intermittent outages, with user complaints stretching from Moscow to Novosibirsk.

This is not a movie plot. It unfolded in October 2026, in real life.

### Data Centers: The Achilles’ Heel

The lessons for ordinary people extend far beyond geopolitics.

It exposes a truth we have long overlooked: **everything you store in the cloud ultimately sits on a server inside a physical building. And that server is far more fragile than you might think.**

We do not need war to prove this. Consider incidents from recent years:
In 2021, a fire broke out at French cloud provider OVH’s Strasbourg facility, destroying four data centers and affecting roughly 3.6 million websites. In 2023, a cooling system failure at an international cloud vendor’s Singapore availability zone caused widespread service disruption. In 2024, a faulty CrowdStrike update triggered blue screens across 8.5 million Windows machines worldwide.

Even in peacetime, data centers fail. Fire, flood, power outages, human error, software bugs — any of these can erase your files temporarily or permanently.

By 2026, data centers face a new risk: **they may be targeted as military assets.**

### What the "Cloud" Really Means

When most people hear "cloud storage", they picture something abstract, omnipresent and permanently online. But "the cloud" is just a catchy metaphor.

At its core, it means: *someone else’s computer*.

More precisely — computers inside someone else’s data center. Those data centers are located in a city in some country, operated by a company, and subject to that firm’s security investment, operational standards and geopolitical exposure.

When you upload files to mainstream cloud drives, you may think you are making a backup. In reality, you are merely swapping one risk — losing your phone — for another: disaster at a third-party data center.

And the latter has vastly wider fallout. If your phone is lost, only your files disappear. If a data center fails, millions of people lose their data.

### Is There a More Reliable Storage Approach?

This is the problem DoraCloud was built to solve.

DoraCloud is a cloud service supporting storage for both private sensitive data and ordinary files. It differs fundamentally from conventional cloud drives in three key ways:

**First: files are encrypted on your device before upload.**
Your files are encrypted locally before leaving your phone. Encryption keys stay only on your own devices and are never uploaded to servers. That means even if DoraCloud’s operators wanted to view your files — or were compelled to hand over your data — all they could provide is ciphertext. Without the key, ciphertext is meaningless gibberish.

**Second: decentralized storage architecture.**
Your full file is never stored entirely inside a single data center. It is split into multiple encrypted fragments and distributed across separate nodes. If any single node fails — whether due to hacking, physical attack, or operator shutdown — your files will not be lost or exposed.

This is different from traditional multi-region backup. With multi-region backup, a complete copy exists at every location; if one copy is compromised, all data is exposed. With DoraCloud’s sharded storage, each node holds only a small encrypted fragment, which is useless on its own.

**Third: partitioned management for private and regular files.**
Work documents, travel photos and daily notes go into the regular zone for convenient everyday access. Scanned ID documents, bank details, medical records and personal diaries reside in the privacy zone — isolated with independent encryption, access controls and encryption keys.

This partition design contains risk. Even if an attacker gains access to your regular zone, your privacy zone remains secure.

### Not Abandoning the Cloud — Using It Smarter

To be clear: DoraCloud does not reject cloud storage. Cloud storage is a groundbreaking invention. It enables cross-device file access, simplifies collaboration, and prevents total data loss when your phone gets water-damaged.

What DoraCloud rejects is **unconditional trust**.

You should never trust any cloud provider unconditionally — no matter how large, famous, or well-marketed their security promises are. History has repeatedly shown that promises cannot replace architecture, and trust cannot replace encryption.

Yandex’s data centers were bombed. OVH’s datacenter burned. A CrowdStrike update crashed computers globally. These were large, technically capable companies with solid security commitments. Accidents still happened.

True security does not rely on trusting a corporation. It relies on **cryptographically strong encryption** and **physically distributed storage architecture**.

### A Question Worth Asking Yourself

How much of your digital life is irreplaceable?
Your child’s newborn photos. Vintage footage of your parents. Raw data from your graduation thesis. Scanned contracts from your first year in business.

Could you bear losing these?

If not, it is time to seriously consider where they are stored, in what format, and who can view them.

Data centers are burning. This question cannot wait.