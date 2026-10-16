# 22,000 Robots Hit the Streets — Is Your Data Still Exposed?

This week, Hangzhou hosted a low-key yet high-impact conference: the 3rd Meeting of the ITU Focus Group on Embodied Intelligence. At the event, the China Academy of Information and Communications Technology (CAICT), together with Tsinghua University, released a report featuring a striking figure:

In the first half of 2026, global shipments of humanoid robots exceeded 22,000 units, representing a nearly 300% year-on-year increase.

Twenty-two thousand may sound modest, but consider this: just last year, these machines were still stumbling through lab trials. This year, they are already deployed for real work across five scenarios: entertainment and commercial performances, scientific education and data collection, visitor guidance and retail assistance, smart manufacturing, and warehouse logistics.

Embodied intelligence is shifting from "demo and experience" to "practical deployment", and from "single-point validation" to "large-scale application".

Meanwhile, Citigroup and Bank of America are restricting AI agents’ access to customer accounts. The industrial cluster for precision components of humanoid robots in Longyou County has been selected as a provincial-level "rising star" industrial cluster in Zhejiang, with its related industrial output exceeding 7 billion yuan last year.

On one hand, robots are growing in number and capability; on the other, banks are growing wary of AI overreach. Taken together, these two developments point to a rapidly emerging question:

**As AI and robots become deeply embedded in daily life, how secure is your data — especially the data stored in the cloud?**

## How Cloud Storage Turns Into "Unprotected Data Exposure"

Let’s start with a basic technical fact.

When you store files on Baidu Netdisk, Google Drive, iCloud or Dropbox, files are first uploaded to the service provider’s servers, where the provider manages, stores, backs up and synchronizes them. What state are your files in during this process?

The answer: **plaintext, or encryption controlled entirely by the service provider.**

What this means is the provider has the technical ability to read your files. Even if it claims "we will not actively inspect your data", the capability exists. Should hackers breach its systems, internal staff abuse access privileges, or AI agents act beyond authorized scope, your files become exposed.

This is no hypothetical scenario. It is a recurring reality in 2026:

- US healthcare platform CareCloud leaked complete medical records of 3.75 million patients — names, social security numbers, bank account details and diagnostic histories were all stolen.
- South Korea’s five major banks suffered synchronized AI-powered hacker attacks; Shinhan Bank saw data leakage affecting 25,000 customers, with the breach detected 25 hours late.
- Zhipu ZCode silently uploaded developers’ full code repositories, including Git history and server credentials.
- The Pentagon’s personnel system was compromised, with data for 2.8 million military personnel stolen, and the data was **unencrypted**.

Data breaches have become so frequent and large-scale that the term "leak" has lost its shock value. Breaches are no longer isolated incidents — they have become the norm.

## The Robot Era: Wider Attack Surface for Data

The advancement of embodied intelligence complicates matters further.

Those 22,000 humanoid robots are deployed across entertainment, education, manufacturing, logistics and other sectors. While operating, they continuously capture massive volumes of data: visual imagery, voice commands, environmental information and operational logs. Such data is usually uploaded to the cloud for model training and optimization.

In other words, robots are not merely "execution tools". They are also **data collectors**.

Once this data sits on centralized cloud platforms, it faces the same risks as files saved on cloud drives: theft by hackers, misuse by insiders, or unauthorized access by AI systems.

Robot numbers will keep rising. The 22,000 figure covers only the first half of this year; the full-year number will likely be higher. What about next year and the year after? When millions of robots upload data to the cloud simultaneously, data breach risks will multiply exponentially.

## The DoraCloud Approach: Separating Storage from Control

Most cloud storage services bundle **storage** and **control rights**. You hand over your files to the provider, who stores and manages them. You trust the provider to keep your data safe.

DoraCloud breaks these two functions apart.

**1. Client-side encryption**
Before upload, your files are encrypted locally on your device. Encryption keys remain only on your device and never pass through any server. Even if DoraCloud’s storage nodes are breached, attackers only obtain ciphertext — meaningless scrambled data without the keys.

**2. Decentralized storage architecture**
After encryption and fragmentation, files are split and distributed across multiple nodes. No single node holds a complete file and cannot reconstruct the full content. There is no central database that can be compromised in a single attack.

**3. Partitioned management**
Ordinary files (work documents, travel photos, project materials) are stored in a general zone for easy synchronization and sharing. Private data (ID scans, financial reports, medical records, password files) resides in a private zone with independent encryption and access controls for an extra layer of protection.

The core logic behind this three-tier design: **even in worst-case scenarios — server intrusion, employee misconduct, or AI privilege escalation — your data remains secure.**

Attackers need three things at once: fragmented ciphertext distributed across nodes, encryption keys held solely by you, and access permissions controlled by you. Missing any one of these, they cannot access your data.

## Not to Abandon the Cloud — But to Use It Wisely

It is important to clarify that DoraCloud is not a rejection of modern technology. It does not force you back to the era of USB file transfers.

Its user experience is largely comparable to mainstream cloud drives: drag-and-drop upload, folder management, online preview, cross-device synchronization. All the convenience features are retained.

The difference lies in the underlying philosophy. Mainstream cloud services operate on "I hold your files, you trust me". DoraCloud follows: **you keep the lock, I store the box.**

In 2026 — with 22,000 robots deployed, AI agents restricted by banks, and data breaches occurring almost weekly — trust has become an expensive commodity.

You do not need to trust any person or organization. You only need to trust mathematics.

The AES‑256 encryption algorithm cannot be brute-forced under current computing power. This is not a corporate promise; it is a fundamental principle of cryptography. Decentralized storage renders single-point attacks ineffective, which is not marketing hype but an inherent property of distributed systems.

DoraCloud packages these proven technologies into a product accessible to ordinary users.

## An Emerging Era

One quote from the embodied intelligence report deserves attention: "Applications of embodied intelligence are gradually evolving from demo and experience to practical deployment, and from single-point validation to large-scale application."

Put simply: robots are truly coming into factories, warehouses, shopping malls and homes.

They will collect, upload and process data — and your data may be among it.

You cannot fully control what data robots capture or send to the cloud. But you can control where your own data is stored, how it is encrypted, and who can access it.

Making this choice before the robot age fully arrives is far wiser than trying to fix breaches after they happen.